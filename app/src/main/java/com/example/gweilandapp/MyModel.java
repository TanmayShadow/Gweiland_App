package com.example.gweilandapp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyModel {

    @SerializedName("data")
    @Expose
    private List<Datum> data;
    @SerializedName("status")
    @Expose
    private Status status;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public MyModel withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public MyModel withStatus(Status status) {
        this.status = status;
        return this;
    }

    public class Datum {

        @SerializedName("circulating_supply")
        @Expose
        private Double circulatingSupply;
        @SerializedName("cmc_rank")
        @Expose
        private Integer cmcRank;
        @SerializedName("date_added")
        @Expose
        private String dateAdded;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("infinite_supply")
        @Expose
        private Boolean infiniteSupply;
        @SerializedName("last_updated")
        @Expose
        private String lastUpdated;
        @SerializedName("max_supply")
        @Expose
        private Object maxSupply;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("num_market_pairs")
        @Expose
        private Integer numMarketPairs;
        @SerializedName("platform")
        @Expose
        private Platform platform;
        @SerializedName("quote")
        @Expose
        private Quote quote;
        @SerializedName("self_reported_circulating_supply")
        @Expose
        private Object selfReportedCirculatingSupply;
        @SerializedName("self_reported_market_cap")
        @Expose
        private Object selfReportedMarketCap;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("symbol")
        @Expose
        private String symbol;
        @SerializedName("tags")
        @Expose
        private List<String> tags;
        @SerializedName("total_supply")
        @Expose
        private Double totalSupply;
        @SerializedName("tvl_ratio")
        @Expose
        private Object tvlRatio;

        public Double getCirculatingSupply() {
            return circulatingSupply;
        }

        public void setCirculatingSupply(Double circulatingSupply) {
            this.circulatingSupply = circulatingSupply;
        }

        public Datum withCirculatingSupply(Double circulatingSupply) {
            this.circulatingSupply = circulatingSupply;
            return this;
        }

        public Integer getCmcRank() {
            return cmcRank;
        }

        public void setCmcRank(Integer cmcRank) {
            this.cmcRank = cmcRank;
        }

        public Datum withCmcRank(Integer cmcRank) {
            this.cmcRank = cmcRank;
            return this;
        }

        public String getDateAdded() {
            return dateAdded;
        }

        public void setDateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
        }

        public Datum withDateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
            return this;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Datum withId(Integer id) {
            this.id = id;
            return this;
        }

        public Boolean getInfiniteSupply() {
            return infiniteSupply;
        }

        public void setInfiniteSupply(Boolean infiniteSupply) {
            this.infiniteSupply = infiniteSupply;
        }

        public Datum withInfiniteSupply(Boolean infiniteSupply) {
            this.infiniteSupply = infiniteSupply;
            return this;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public Datum withLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Object getMaxSupply() {
            return maxSupply;
        }

        public void setMaxSupply(Object maxSupply) {
            this.maxSupply = maxSupply;
        }

        public Datum withMaxSupply(Object maxSupply) {
            this.maxSupply = maxSupply;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Datum withName(String name) {
            this.name = name;
            return this;
        }

        public Integer getNumMarketPairs() {
            return numMarketPairs;
        }

        public void setNumMarketPairs(Integer numMarketPairs) {
            this.numMarketPairs = numMarketPairs;
        }

        public Datum withNumMarketPairs(Integer numMarketPairs) {
            this.numMarketPairs = numMarketPairs;
            return this;
        }

        public Platform getPlatform() {
            return platform;
        }

        public void setPlatform(Platform platform) {
            this.platform = platform;
        }

        public Datum withPlatform(Platform platform) {
            this.platform = platform;
            return this;
        }

        public Quote getQuote() {
            return quote;
        }

        public void setQuote(Quote quote) {
            this.quote = quote;
        }

        public Datum withQuote(Quote quote) {
            this.quote = quote;
            return this;
        }

        public Object getSelfReportedCirculatingSupply() {
            return selfReportedCirculatingSupply;
        }

        public void setSelfReportedCirculatingSupply(Object selfReportedCirculatingSupply) {
            this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
        }

        public Datum withSelfReportedCirculatingSupply(Object selfReportedCirculatingSupply) {
            this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
            return this;
        }

        public Object getSelfReportedMarketCap() {
            return selfReportedMarketCap;
        }

        public void setSelfReportedMarketCap(Object selfReportedMarketCap) {
            this.selfReportedMarketCap = selfReportedMarketCap;
        }

        public Datum withSelfReportedMarketCap(Object selfReportedMarketCap) {
            this.selfReportedMarketCap = selfReportedMarketCap;
            return this;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public Datum withSlug(String slug) {
            this.slug = slug;
            return this;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public Datum withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public Datum withTags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Double getTotalSupply() {
            return totalSupply;
        }

        public void setTotalSupply(Double totalSupply) {
            this.totalSupply = totalSupply;
        }

        public Datum withTotalSupply(Double totalSupply) {
            this.totalSupply = totalSupply;
            return this;
        }

        public Object getTvlRatio() {
            return tvlRatio;
        }

        public void setTvlRatio(Object tvlRatio) {
            this.tvlRatio = tvlRatio;
        }

        public Datum withTvlRatio(Object tvlRatio) {
            this.tvlRatio = tvlRatio;
            return this;
        }

    }



    public class Platform {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("symbol")
        @Expose
        private String symbol;
        @SerializedName("token_address")
        @Expose
        private String tokenAddress;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Platform withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Platform withName(String name) {
            this.name = name;
            return this;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public Platform withSlug(String slug) {
            this.slug = slug;
            return this;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public Platform withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public String getTokenAddress() {
            return tokenAddress;
        }

        public void setTokenAddress(String tokenAddress) {
            this.tokenAddress = tokenAddress;
        }

        public Platform withTokenAddress(String tokenAddress) {
            this.tokenAddress = tokenAddress;
            return this;
        }

    }

    public class Quote {

        @SerializedName("USD")
        @Expose
        private Usd usd;

        public Usd getUsd() {
            return usd;
        }

        public void setUsd(Usd usd) {
            this.usd = usd;
        }

        public Quote withUsd(Usd usd) {
            this.usd = usd;
            return this;
        }

    }

    public class Status {

        @SerializedName("credit_count")
        @Expose
        private Integer creditCount;
        @SerializedName("elapsed")
        @Expose
        private Integer elapsed;
        @SerializedName("error_code")
        @Expose
        private Integer errorCode;
        @SerializedName("error_message")
        @Expose
        private Object errorMessage;
        @SerializedName("notice")
        @Expose
        private Object notice;
        @SerializedName("timestamp")
        @Expose
        private String timestamp;
        @SerializedName("total_count")
        @Expose
        private Integer totalCount;

        public Integer getCreditCount() {
            return creditCount;
        }

        public void setCreditCount(Integer creditCount) {
            this.creditCount = creditCount;
        }

        public Status withCreditCount(Integer creditCount) {
            this.creditCount = creditCount;
            return this;
        }

        public Integer getElapsed() {
            return elapsed;
        }

        public void setElapsed(Integer elapsed) {
            this.elapsed = elapsed;
        }

        public Status withElapsed(Integer elapsed) {
            this.elapsed = elapsed;
            return this;
        }

        public Integer getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
        }

        public Status withErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Object getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(Object errorMessage) {
            this.errorMessage = errorMessage;
        }

        public Status withErrorMessage(Object errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Object getNotice() {
            return notice;
        }

        public void setNotice(Object notice) {
            this.notice = notice;
        }

        public Status withNotice(Object notice) {
            this.notice = notice;
            return this;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public Status withTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public Status withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

    }

    public class Usd {

        @SerializedName("fully_diluted_market_cap")
        @Expose
        private Double fullyDilutedMarketCap;
        @SerializedName("last_updated")
        @Expose
        private String lastUpdated;
        @SerializedName("market_cap")
        @Expose
        private Double marketCap;
        @SerializedName("market_cap_dominance")
        @Expose
        private Double marketCapDominance;
        @SerializedName("percent_change_1h")
        @Expose
        private Double percentChange1h;
        @SerializedName("percent_change_24h")
        @Expose
        private Double percentChange24h;
        @SerializedName("percent_change_30d")
        @Expose
        private Double percentChange30d;
        @SerializedName("percent_change_60d")
        @Expose
        private Double percentChange60d;
        @SerializedName("percent_change_7d")
        @Expose
        private Double percentChange7d;
        @SerializedName("percent_change_90d")
        @Expose
        private Double percentChange90d;
        @SerializedName("price")
        @Expose
        private Double price;
        @SerializedName("tvl")
        @Expose
        private Object tvl;
        @SerializedName("volume_24h")
        @Expose
        private Double volume24h;
        @SerializedName("volume_change_24h")
        @Expose
        private Double volumeChange24h;

        public Double getFullyDilutedMarketCap() {
            return fullyDilutedMarketCap;
        }

        public void setFullyDilutedMarketCap(Double fullyDilutedMarketCap) {
            this.fullyDilutedMarketCap = fullyDilutedMarketCap;
        }

        public Usd withFullyDilutedMarketCap(Double fullyDilutedMarketCap) {
            this.fullyDilutedMarketCap = fullyDilutedMarketCap;
            return this;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public Usd withLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Double getMarketCap() {
            return marketCap;
        }

        public void setMarketCap(Double marketCap) {
            this.marketCap = marketCap;
        }

        public Usd withMarketCap(Double marketCap) {
            this.marketCap = marketCap;
            return this;
        }

        public Double getMarketCapDominance() {
            return marketCapDominance;
        }

        public void setMarketCapDominance(Double marketCapDominance) {
            this.marketCapDominance = marketCapDominance;
        }

        public Usd withMarketCapDominance(Double marketCapDominance) {
            this.marketCapDominance = marketCapDominance;
            return this;
        }

        public Double getPercentChange1h() {
            return percentChange1h;
        }

        public void setPercentChange1h(Double percentChange1h) {
            this.percentChange1h = percentChange1h;
        }

        public Usd withPercentChange1h(Double percentChange1h) {
            this.percentChange1h = percentChange1h;
            return this;
        }

        public Double getPercentChange24h() {
            return percentChange24h;
        }

        public void setPercentChange24h(Double percentChange24h) {
            this.percentChange24h = percentChange24h;
        }

        public Usd withPercentChange24h(Double percentChange24h) {
            this.percentChange24h = percentChange24h;
            return this;
        }

        public Double getPercentChange30d() {
            return percentChange30d;
        }

        public void setPercentChange30d(Double percentChange30d) {
            this.percentChange30d = percentChange30d;
        }

        public Usd withPercentChange30d(Double percentChange30d) {
            this.percentChange30d = percentChange30d;
            return this;
        }

        public Double getPercentChange60d() {
            return percentChange60d;
        }

        public void setPercentChange60d(Double percentChange60d) {
            this.percentChange60d = percentChange60d;
        }

        public Usd withPercentChange60d(Double percentChange60d) {
            this.percentChange60d = percentChange60d;
            return this;
        }

        public Double getPercentChange7d() {
            return percentChange7d;
        }

        public void setPercentChange7d(Double percentChange7d) {
            this.percentChange7d = percentChange7d;
        }

        public Usd withPercentChange7d(Double percentChange7d) {
            this.percentChange7d = percentChange7d;
            return this;
        }

        public Double getPercentChange90d() {
            return percentChange90d;
        }

        public void setPercentChange90d(Double percentChange90d) {
            this.percentChange90d = percentChange90d;
        }

        public Usd withPercentChange90d(Double percentChange90d) {
            this.percentChange90d = percentChange90d;
            return this;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Usd withPrice(Double price) {
            this.price = price;
            return this;
        }

        public Object getTvl() {
            return tvl;
        }

        public void setTvl(Object tvl) {
            this.tvl = tvl;
        }

        public Usd withTvl(Object tvl) {
            this.tvl = tvl;
            return this;
        }

        public Double getVolume24h() {
            return volume24h;
        }

        public void setVolume24h(Double volume24h) {
            this.volume24h = volume24h;
        }

        public Usd withVolume24h(Double volume24h) {
            this.volume24h = volume24h;
            return this;
        }

        public Double getVolumeChange24h() {
            return volumeChange24h;
        }

        public void setVolumeChange24h(Double volumeChange24h) {
            this.volumeChange24h = volumeChange24h;
        }

        public Usd withVolumeChange24h(Double volumeChange24h) {
            this.volumeChange24h = volumeChange24h;
            return this;
        }

    }

}

