import { render } from '@acmehealth/shared-utils-jest'

import AutoComplete from './auto-complete'

describe('AutoComplete', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<AutoComplete options={[]} />)
    expect(baseElement).toBeTruthy()
  })
})
