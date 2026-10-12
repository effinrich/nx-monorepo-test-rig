import { Helmet } from 'react-helmet'
import { useParams } from 'react-router-dom'
import { useGetCompanyById } from '@acmehealth/portal/data-assets'
import { CompanyDetailsPage, Page } from '@acmehealth/portal/ui'

const CompanyDetails = () => {
  const { companyId } = useParams()
  const { data: company } = useGetCompanyById(companyId)
  return (
    <Page>
      {company && (
        <Helmet>
          <title>{company.name} Details</title>
        </Helmet>
      )}
      <CompanyDetailsPage />
    </Page>
  )
}

export default CompanyDetails
