import analytics from '@acmehealth/analytics'
import { useRequestIpListingContactInfo } from '@acmehealth/portal/data-assets'
import { Modal, ModalOverlay } from '@acmehealth/ui'

import Disclaimer from './partials/disclaimer'
import Success from './partials/success'
interface SellerReleaseModalProps {
  onClose(): void
  isOpen: boolean
  buyerEmail?: string
  ipListingId?: string
}

const SellerReleaseModal = ({
  onClose,
  isOpen,
  buyerEmail,
  ipListingId
}: SellerReleaseModalProps) => {
  const {
    mutateAsync: requestSellerInfo,
    isSuccess,
    isPending
  } = useRequestIpListingContactInfo(ipListingId, buyerEmail)

  return (
    <Modal open={isOpen} onOpenChange={(e: { open: boolean }) => !e.open && onClose()} size="xl">
      <ModalOverlay />
      {isSuccess ? (
        <Success onConfirmation={onClose} />
      ) : (
        <Disclaimer
          onCancel={onClose}
          onSubmit={async () => {
            await requestSellerInfo()
            analytics.sendDisclaimerAccept({ type: 'SELLER' })
          }}
          isSubmitting={isPending}
        />
      )}
    </Modal>
  )
}

export default SellerReleaseModal
