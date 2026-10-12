import { MdEdit } from 'react-icons/md'
import { Link as RouterLink } from 'react-router-dom'
import { useGetUserInfo } from '@acmehealth/portal/data-assets'
import { HasRole } from '@acmehealth/portal/utils'
import { Icon, IconButton, Loader, SectionHeader } from '@acmehealth/ui'
interface MarketplaceHeaderProps {
  companyName: string
  activityType?: string
}
const MarketplaceHeader = ({
  companyName,
  activityType
}: MarketplaceHeaderProps) => {
  const { data: currentUser } = useGetUserInfo()
  return (
    <SectionHeader
      title={companyName}
      helpText={activityType}
      rightElement={
        currentUser ? (
          <HasRole
            currentRole={currentUser.role?.authority}
            allowed={['ROLE_RH_ADMIN', 'ROLE_SUPER_ADMIN']}
          >
            <IconButton
              asChild
              variant="outline"
              aria-label="Edit company"
            >
              <RouterLink to="edit-marketplace-company">
                <Icon as={MdEdit} />
              </RouterLink>
            </IconButton>
          </HasRole>
        ) : (
          <Loader />
        )
      }
      isDivider={false}
    />
  )
}

export default MarketplaceHeader
