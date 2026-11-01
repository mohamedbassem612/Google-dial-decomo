package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class epu {
    public static final defpackage.epu a = new defpackage.epu(0, 1);
    public final int b;
    public final int c;
    private android.media.AudioAttributes d;

    static {
        java.lang.String str = eum.a;
    }

    public epu(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final android.media.AudioAttributes a() {
        android.media.AudioAttributes audioAttributes = this.d;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(this.b).setFlags(0).setUsage(this.c);
        fn$.ExternalSyntheticApiModelOutline0.m(usage, 1);
        fn$.ExternalSyntheticApiModelOutline0.m(usage, true);
        if (android.os.Build.VERSION.SDK_INT >= 32) {
            ebc$.ExternalSyntheticApiModelOutline7.m(usage, 0);
            ebc$.ExternalSyntheticApiModelOutline7.m(usage, false);
        }
        android.media.AudioAttributes audioAttributesBuild = usage.build();
        this.d = audioAttributesBuild;
        return audioAttributesBuild;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.epu epuVar = (defpackage.epu) obj;
            if (this.b == epuVar.b && this.c == epuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b + 527) * 961) + this.c) * 31) + 1) * 29791) + 1;
    }
}
