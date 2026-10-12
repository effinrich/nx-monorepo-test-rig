import { Helmet } from 'react-helmet'
import { useParams } from 'react-router-dom'
import { useGetIpListing } from '@acmehealth/portal/data-assets'
import { IpListingDetailsPage, Page } from '@acmehealth/portal/ui'
import { Loader } from '@acmehealth/ui'

const IpListingDetails = () => {
  const { ipListingId } = useParams()
  const { data: ipListing } = useGetIpListing(ipListingId)

  return (
    <Page>
      {ipListing && (
        <Helmet>
          <title>IP Listing Details: {ipListing.name}</title>
        </Helmet>
      )}
      {!ipListing ? <Loader /> : <IpListingDetailsPage />}
    </Page>
  )
}

export default IpListingDetails
