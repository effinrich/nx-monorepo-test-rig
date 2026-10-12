import { render } from '@acmehealth/shared-utils-jest'

import { SimpleGrid } from './simple-grid'

describe('SimpleGrid', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<SimpleGrid />)
    expect(baseElement).toBeTruthy()
  })
})
