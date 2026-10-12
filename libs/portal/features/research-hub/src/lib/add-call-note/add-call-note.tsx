import { Helmet } from 'react-helmet'
import { AddCallNotePage, Page } from '@acmehealth/portal/ui'

export const AddCallNote = () => {
  return (
    <Page>
      <Helmet>Add Call Note</Helmet>
      <AddCallNotePage />
    </Page>
  )
}

export default AddCallNote
