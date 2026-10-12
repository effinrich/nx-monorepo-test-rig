import { Helmet } from 'react-helmet'
import { useParams } from 'react-router-dom'
import {
  useGetUserInfo,
  useGetVendorById
} from '@acmehealth/portal/data-assets'
import { Page, VendorDetailsPage } from '@acmehealth/portal/ui'
import { Loader } from '@acmehealth/ui'

const VendorDetails = () => {
  const { vendorId } = useParams()

  const { data: vendor } = useGetVendorById(vendorId)
  const { data: userInfo } = useGetUserInfo()

  return (
    <Page>
      {vendor && (
        <Helmet>
          <title>Vendor Details: {vendor.name}</title>
        </Helmet>
      )}
      {userInfo && vendor ? (
        <VendorDetailsPage
          data={vendor}
          canEdit={userInfo.role?.authority === 'ROLE_SUPER_ADMIN'}
        />
      ) : (
        <Loader size="lg" />
      )}
    </Page>
  )
}

export default VendorDetails
