package pl.zankowski.iextrading4j.sample.iexapi.rest;

import pl.zankowski.iextrading4j.api.refdata.ExchangeSymbol;
import pl.zankowski.iextrading4j.api.stocks.*;
import pl.zankowski.iextrading4j.client.IEXApiClient;
import pl.zankowski.iextrading4j.client.IEXTradingClient;
import pl.zankowski.iextrading4j.client.rest.request.refdata.SymbolsRequestBuilder;
import pl.zankowski.iextrading4j.client.rest.request.stocks.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Deprecated
public class StocksSample {

    private final IEXApiClient iexTradingClient = IEXTradingClient.create();

    public static void main(String[] args) {
        final StocksSample sampleSuite = new StocksSample();

        sampleSuite.batchRequestSample();
        sampleSuite.batchMarketRequestSample();
        sampleSuite.bookRequestSample();
        sampleSuite.chartRequestSample();
        sampleSuite.companyRequestSample();
        sampleSuite.cryptoRequestSample();
        sampleSuite.delayedQuoteRequestSample();
        sampleSuite.dividendsRequestSample();
        sampleSuite.dynamicChartRequestSample();
        sampleSuite.earningsRequestSample();
        sampleSuite.todayEarningsRequestSample();
        sampleSuite.effectiveSpreadRequestSample();
        sampleSuite.financialsRequestSample();
        sampleSuite.keyStatsRequestSample();
        sampleSuite.listRequestSample();
        sampleSuite.logoRequestSample();
        sampleSuite.newsRequestSample();
        sampleSuite.openCloseRequestSample();
        sampleSuite.peersRequestSample();
        sampleSuite.previousRequestSample();
        sampleSuite.priceRequestSample();
        sampleSuite.quoteRequestSample();
        sampleSuite.relevantRequestSample();
        sampleSuite.splitsRequestSample();
        sampleSuite.venueVolumeRequestSample();
        sampleSuite.ohlcRequestSample();
        sampleSuite.shortInterestRequestSample();
        sampleSuite.timeSeriesRequestSample();
        sampleSuite.thresholdSecuritiesRequestSample();
        sampleSuite.ohlcMarketRequestSample();
        sampleSuite.previousMarketRequestSample();
        sampleSuite.todayIposRequestSample();
        sampleSuite.upcomingIposRequestSample();
        sampleSuite.sectorPerformanceRequestSample();
    }

    private void batchRequestSample() {
        final BatchStocks batchStocks = iexTradingClient.executeRequest(new BatchStocksRequestBuilder()
                .withSymbol("AAPL")
                .addType(BatchStocksType.BOOK)
                .addType(BatchStocksType.COMPANY)
                .addType(BatchStocksType.EARNINGS)
                .build());
        System.out.println(batchStocks);
    }

    private void batchMarketRequestSample() {
        final Map<String, BatchStocks> batchStocksMap = iexTradingClient.executeRequest(new BatchMarketStocksRequestBuilder()
                .withSymbol("AAPL")
                .addType(BatchStocksType.COMPANY)
                .addType(BatchStocksType.EARNINGS)
                .build());
        System.out.println(batchStocksMap);
    }

    private void bookRequestSample() {
        final Book book = iexTradingClient.executeRequest(new BookRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(book);
    }

    private void cryptoRequestSample() {
        final List<Quote> cryptoResponse = iexTradingClient.executeRequest(new CryptoRequestBuilder()
                .build());
        System.out.println(cryptoResponse);
    }

    private void chartRequestSample() {
        final List<Chart> chartList = iexTradingClient.executeRequest(new ChartRequestBuilder()
                .withChartRange(ChartRange.ONE_MONTH)
                .withSymbol("AAPL")
                .build());
        System.out.println(chartList);
    }

    private void dynamicChartRequestSample() {
        final DynamicChart dynamicChart = iexTradingClient.executeRequest(new DynamicChartRequestBuilder()
                .withSymbol("aapl")
                .build());
        System.out.println(dynamicChart);
    }

    private void companyRequestSample() {
        final Company company = iexTradingClient.executeRequest(new CompanyRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(company);
    }

    private void delayedQuoteRequestSample() {
        final DelayedQuote delayedQuote = iexTradingClient.executeRequest(new DelayedQuoteRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(delayedQuote);
    }

    private void dividendsRequestSample() {
        final List<Dividends> dividends = iexTradingClient.executeRequest(new DividendsRequestBuilder()
                .withSymbol("AAPL")
                .withDividendRange(DividendRange.SIX_MONTHS)
                .build());
        System.out.println(dividends);
    }

    private void earningsRequestSample() {
        final Earnings earnings = iexTradingClient.executeRequest(new EarningsRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(earnings);
    }

    private void todayEarningsRequestSample() {
        final TodayEarnings todayEarnings = iexTradingClient.executeRequest(new TodayEarningsRequestBuilder()
                .build());
        System.out.println(todayEarnings);
    }

    private void effectiveSpreadRequestSample() {
        final List<EffectiveSpread> effectiveSpreads = iexTradingClient.executeRequest(new EffectiveSpreadRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(effectiveSpreads);
    }

    private void financialsRequestSample() {
        final Financials financials = iexTradingClient.executeRequest(new FinancialsRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(financials);
    }

    private void keyStatsRequestSample() {
        final KeyStats keyStats = iexTradingClient.executeRequest(new KeyStatsRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(keyStats);
    }

    private void listRequestSample() {
        final List<Quote> quoteList = iexTradingClient.executeRequest(new ListRequestBuilder()
                .withListType(ListType.IEXVOLUME)
                .build());
        System.out.println(quoteList);
    }

    private void logoRequestSample() {
        final Logo logo = iexTradingClient.executeRequest(new LogoRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(logo);
    }

    private void newsRequestSample() {
        final List<News> newsList = iexTradingClient.executeRequest(new NewsRequestBuilder()
                .withWorldNews()
                .build());
        System.out.println(newsList);
    }

    private void openCloseRequestSample() {
        final Ohlc ohlc = iexTradingClient.executeRequest(new OpenCloseRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(ohlc);
    }

    private void peersRequestSample() {
        final List<String> peers = iexTradingClient.executeRequest(new PeersRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(peers);
    }

    private void previousRequestSample() {
        final BarData bar = iexTradingClient.executeRequest(new PreviousRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(bar);
    }

    private void previousMarketRequestSample() {
        final Map<String, BarData> barDataMap = iexTradingClient.executeRequest(new PreviousMarketRequestBuilder()
                .build());
        System.out.println(barDataMap);
    }

    private void priceRequestSample() {
        final BigDecimal price = iexTradingClient.executeRequest(new PriceRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(price);
    }

    private void quoteRequestSample() {
        final List<ExchangeSymbol> exchangeSymbols = iexTradingClient.executeRequest(new SymbolsRequestBuilder().build());
        for (final ExchangeSymbol exchangeSymbol : exchangeSymbols) {
            final Quote quote = iexTradingClient.executeRequest(new QuoteRequestBuilder()
                    .withSymbol(exchangeSymbol.getSymbol())
                    .build());

            System.out.println(quote);
        }
    }

    private void relevantRequestSample() {
        final Relevant relevant = iexTradingClient.executeRequest(new RelevantRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(relevant);
    }

    private void splitsRequestSample() {
        final List<Split> splitList = iexTradingClient.executeRequest(new SplitsRequestBuilder()
                .withSymbol("AAPL")
                .withSplitsRange(SplitsRange.FIVE_YEARS)
                .build());
        System.out.println(splitList);
    }

    private void venueVolumeRequestSample() {
        final List<VenueVolume> venueVolumeList = iexTradingClient.executeRequest(new VenueVolumeRequestBuilder()
                .withSymbol("AAPL")
                .build());
        System.out.println(venueVolumeList);
    }

    private void ohlcRequestSample() {
        final Ohlc ohlc = iexTradingClient.executeRequest(new OhlcRequestBuilder()
                .withSymbol("aapl")
                .build());
        System.out.println(ohlc);
    }

    private void ohlcMarketRequestSample() {
        final Map<String, Ohlc> ohlcMap = iexTradingClient.executeRequest(new OhlcMarketRequestBuilder()
                .build());
        System.out.println(ohlcMap);
    }

    private void shortInterestRequestSample() {
        final List<ShortInterest> shortInterestList = iexTradingClient.executeRequest(new ShortInterestRequestBuilder()
                .withSample()
                .withMarket()
                .build());
        System.out.println(shortInterestList);
    }

    private void timeSeriesRequestSample() {
        final List<TimeSeries> timeSeriesList = iexTradingClient.executeRequest(new TimeSeriesRequestBuilder()
                .withSymbol("aapl")
                .build());
        System.out.println(timeSeriesList);
    }

    private void thresholdSecuritiesRequestSample() {
        final List<ThresholdSecurities> thresholdSecuritiesList = iexTradingClient.executeRequest(new ThresholdSecuritiesRequestBuilder()
                .withSample()
                .withMarket()
                .build());
        System.out.println(thresholdSecuritiesList);
    }

    private void todayIposRequestSample() {
        final TodayIpos todayIpos = iexTradingClient.executeRequest(new TodayIposRequestBuilder()
                .build());
        System.out.println(todayIpos);
    }

    private void upcomingIposRequestSample() {
        final Ipos ipos = iexTradingClient.executeRequest(new UpcomingIposRequestBuilder()
                .build());
        System.out.println(ipos);
    }

    private void sectorPerformanceRequestSample() {
        final List<SectorPerformance> sectorPerformances = iexTradingClient.executeRequest(
                new SectorPerformanceRequestBuilder().build());
        System.out.println(sectorPerformances);
    }

    private void sectorCollectionRequestSample() {
        final List<Quote> quotes = iexTradingClient.executeRequest(new CollectionRequestBuilder()
                .withCollectionType(CollectionType.SECTOR)
                .withCollectionName("Financials")
                .build());
        System.out.println(quotes);
    }

    private void listCollectionRequestSample() {
        final List<Quote> quotes = iexTradingClient.executeRequest(new CollectionRequestBuilder()
                .withCollectionType(CollectionType.LIST)
                .withCollectionName("iexvolume")
                .build());
        System.out.println(quotes);
    }

    private void tagCollectionRequestSample() {
        final List<Quote> quotes = iexTradingClient.executeRequest(new CollectionRequestBuilder()
                .withCollectionType(CollectionType.TAG)
                .withCollectionName("Technology")
                .build());
        System.out.println(quotes);
    }

}
