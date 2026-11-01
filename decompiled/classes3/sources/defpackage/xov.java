package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xov implements aood {
    public static final defpackage.xov a = new defpackage.xov();

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.xov) && (obj instanceof aood)) {
            return aooh.n(new aoof(0, j$.time.Instant.class, "now", "now()Ljava/time/Instant;", 0), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return new aoof(0, j$.time.Instant.class, "now", "now()Ljava/time/Instant;", 0);
    }

    public final int hashCode() {
        return new aoof(0, j$.time.Instant.class, "now", "now()Ljava/time/Instant;", 0).hashCode();
    }
}
