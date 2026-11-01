package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adnx extends defpackage.adnz {
    private final adoi a;

    public adnx(adoi adoiVar) {
        this.a = adoiVar;
    }

    @Override // defpackage.adnz, defpackage.adok
    public final adoi a() {
        return this.a;
    }

    @Override // defpackage.adok
    public final int b() {
        return 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adok)) {
            return false;
        }
        defpackage.adok adokVar = (defpackage.adok) obj;
        return adokVar.b() == 1 && this.a.equals(adokVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallerIntent{callerTranscript=" + this.a.toString() + '}';
    }
}
