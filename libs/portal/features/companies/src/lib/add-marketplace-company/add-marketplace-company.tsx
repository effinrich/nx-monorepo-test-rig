import { Helmet } from 'react-helmet'
import { useNavigate } from 'react-router-dom'
import { useCreateCompany } from '@acmehealth/portal/data-assets'
import {
  BackButton,
  MarketplaceCompanyForm,
  Page
} from '@acmehealth/portal/ui'
import { SectionHeader } from '@acmehealth/ui'

const AddMarketplaceCompany = () => {
  const { mutateAsync: createCompany } = useCreateCompany()
  const navigate = useNavigate()

  return (
    <Page>
      <Helmet>
        <title>Marketplace Company | Add</title>
      </Helmet>
      <BackButton>Back to companies</BackButton>
      <SectionHeader
        title="New marketplace company"
        helpText="Tell us a little about the company."
        isDivider={false}
        mb={6}
        mt={6}
      />
      <MarketplaceCompanyForm
        onSubmit={async data => {
          await createCompany(data)
          navigate(`/companies`)
        }}
        submitText="Add company"
        onCancel={() => navigate('/companies')}
      />
    </Page>
  )
}

export default AddMarketplaceCompany
