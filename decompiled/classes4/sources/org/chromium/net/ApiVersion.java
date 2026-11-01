package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class ApiVersion {
    private static final int API_LEVEL = 49;
    private static final java.lang.String CRONET_VERSION = "156.0.8078.39";
    private static final java.lang.String LAST_CHANGE = "6f8bd0510049073dacc94db8968ba350678da324-refs/branch-heads/8078@{#1201}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static java.lang.String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static java.lang.String getCronetVersionWithLastChange() {
        return "156.0.8078.39@6f8bd051";
    }

    public static java.lang.String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return API_LEVEL;
    }
}
