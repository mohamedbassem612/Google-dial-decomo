package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahox {
    public final int a;
    public final int b;
    public final int c;
    public final java.lang.Object d;

    public ahox(defpackage.xyg xygVar) {
        this.d = xygVar.a;
        int i = true != xygVar.b.isLowRamDevice() ? 4194304 : 2097152;
        this.b = i;
        android.app.ActivityManager activityManager = xygVar.b;
        int iRound = java.lang.Math.round((activityManager.getMemoryClass() << 20) * (true != activityManager.isLowRamDevice() ? 0.4f : 0.33f));
        float f = (((android.util.DisplayMetrics) xygVar.d.a).widthPixels * ((android.util.DisplayMetrics) xygVar.d.a).heightPixels) << 2;
        int iRound2 = java.lang.Math.round(xygVar.c * f);
        int iRound3 = java.lang.Math.round(f + f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.a = iRound3;
            this.c = iRound2;
        } else {
            float f2 = i2 / (xygVar.c + 2.0f);
            iRound3 = java.lang.Math.round(f2 + f2);
            this.a = iRound3;
            iRound2 = java.lang.Math.round(f2 * xygVar.c);
            this.c = iRound2;
        }
        if (android.util.Log.isLoggable("MemorySizeCalculator", 3)) {
            java.lang.String strA = a(iRound3);
            java.lang.String strA2 = a(iRound2);
            java.lang.String strA3 = a(i);
            boolean z = i3 > iRound;
            android.util.Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + strA + ", pool size: " + strA2 + ", byte array size: " + strA3 + ", memory class limited? " + z + ", max size: " + a(iRound) + ", memoryClass: " + xygVar.b.getMemoryClass() + ", isLowMemoryDevice: " + xygVar.b.isLowRamDevice());
        }
    }

    private final java.lang.String a(int i) {
        return android.text.format.Formatter.formatFileSize((android.content.Context) this.d, i);
    }

    public ahox(java.lang.String str, int i, int i2) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = -1;
    }

    public ahox(java.lang.String str, int i, int i2, int i3) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public ahox(defpackage.ahoy ahoyVar, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ahoyVar;
    }
}
