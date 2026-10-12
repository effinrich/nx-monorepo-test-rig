import { Helmet } from 'react-helmet'
import { Page, ResearchHubPage } from '@acmehealth/portal/ui'
import { getCurrentUserRole } from '@acmehealth/portal/utils'

export const ResearchHub = () => {
  const role = getCurrentUserRole()
  const hideArticlesSupport = !role?.includes('SUPER')

  return (
    <Page>
      <Helmet>
        <title>Research Hub</title>
      </Helmet>
      <ResearchHubPage hideArticlesSupport={hideArticlesSupport} />
    </Page>
  )
}

export default ResearchHub
