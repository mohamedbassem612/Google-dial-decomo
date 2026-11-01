package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class ThreadStatsUid {
    private static final java.lang.reflect.Method sClearThreadStatsUid;
    private static final java.lang.reflect.Method sSetThreadStatsUid;

    static {
        try {
            sSetThreadStatsUid = android.net.TrafficStats.class.getMethod("setThreadStatsUid", java.lang.Integer.TYPE);
            sClearThreadStatsUid = android.net.TrafficStats.class.getMethod("clearThreadStatsUid", null);
        } catch (java.lang.NoSuchMethodException | java.lang.SecurityException e) {
            throw new java.lang.RuntimeException("Unable to get TrafficStats methods", e);
        }
    }

    public static void clear() {
        try {
            sClearThreadStatsUid.invoke(null, null);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("TrafficStats.clearThreadStatsUid failed", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException("TrafficStats.clearThreadStatsUid failed", e2);
        }
    }

    public static void set(int i) {
        try {
            sSetThreadStatsUid.invoke(null, java.lang.Integer.valueOf(i));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("TrafficStats.setThreadStatsUid failed", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException("TrafficStats.setThreadStatsUid failed", e2);
        }
    }
}
