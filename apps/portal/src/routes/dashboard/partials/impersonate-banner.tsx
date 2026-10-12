import { useNavigate } from 'react-router-dom'
import { BannerAlert } from '@acmehealth/portal/ui'
import { unsetImpersonatedEmail } from '@acmehealth/portal/utils'
import { Button, Text } from '@acmehealth/ui'

interface ImpersonateBannerProps {
  userInfo: {
    givenName?: string | undefined
    familyName?: string | undefined
  }
}

export const ImpersonateBanner = ({ userInfo }: ImpersonateBannerProps) => {
  const navigate = useNavigate()

  const handleOnClick = () => {
    unsetImpersonatedEmail()
    navigate(0)
  }

  return (
    <BannerAlert
      rightElement={
        <Button onClick={() => handleOnClick()} size="sm">
          Stop impersonation mode
        </Button>
      }
    >
      <Text>
        {userInfo.givenName && userInfo.familyName
          ? `You are currently impersonating ${userInfo.givenName} ${userInfo.familyName}.`
          : 'You are currently in impersonation mode.'}
      </Text>
    </BannerAlert>
  )
}

export default ImpersonateBanner
