package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxd extends defpackage.aafw {
    private final int d;

    public aaxd(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (a("event_type") == 1) {
            str = "changed";
        } else {
            str = a("event_type") == 2 ? "deleted" : "unknown";
        }
        return "DataEventRef{ type=" + str + ", dataitem=" + new defpackage.aaxe(this.a, this.b, this.d).toString() + " }";
    }
}
