import { Helmet } from 'react-helmet'
import { IPMarketplacePage, Page } from '@acmehealth/portal/ui'

export const IPMarketplace = () => {
  return (
    <Page>
      <Helmet>
        <title>IP Marketplace Directory</title>
      </Helmet>
      <IPMarketplacePage />
    </Page>
  )
}

export default IPMarketplace
