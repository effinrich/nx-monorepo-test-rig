import { Helmet } from 'react-helmet'
import { useParams } from 'react-router-dom'
import { useGetVendorById } from '@acmehealth/portal/data-assets'
import {
  // ceoFormResolver,
  EditVendorPage,
  Page
} from '@acmehealth/portal/ui'
import { Loader } from '@acmehealth/ui'

export const EditVendor = () => {
  const { vendorId } = useParams()

  const { data } = useGetVendorById(vendorId)

  return (
    <Page>
      <Helmet>
        <title>Vendors | Edit</title>
      </Helmet>
      {data ? <EditVendorPage data={data} /> : <Loader size="lg" />}
    </Page>
  )
}

export default EditVendor
