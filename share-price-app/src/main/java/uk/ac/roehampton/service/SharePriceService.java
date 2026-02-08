package uk.ac.roehampton.service;

import uk.ac.roehampton.client.MarketDataClient;
import uk.ac.roehampton.repository.JsonPriceRepository;
/**
 * SharePriceService is the main business logic layer of the application.
 *
 * It acts as the middleman between:
 * - the UI (user requests)
 * - the external market data client
 * - the local JSON storage
 *
 * This class decides:
 * - when to fetch data from the external API
 * - when to load data from local storage
 * - what data should be sent back to the UI
 */
public class SharePriceService {

    private final MarketDataClient marketDataClient;
    private final JsonPriceRepository jsonPriceRepository;

    public SharePriceService(
            MarketDataClient marketDataClient,
            JsonPriceRepository jsonPriceRepository
    ) {
        this.marketDataClient = marketDataClient;
        this.jsonPriceRepository = jsonPriceRepository;
    }
    public String getSharePrice(String ticker) {
        return marketDataClient.fetchPrice(ticker);
    }


}
