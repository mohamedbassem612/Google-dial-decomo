package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adny extends defpackage.adnz {
    private final adoj a;

    public adny(adoj adojVar) {
        this.a = adojVar;
    }

    @Override // defpackage.adok
    public final int b() {
        return 2;
    }

    @Override // defpackage.adnz, defpackage.adok
    public final adoj c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adok)) {
            return false;
        }
        defpackage.adok adokVar = (defpackage.adok) obj;
        return adokVar.b() == 2 && this.a.equals(adokVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallerIntent{playedAvatarMessage=" + this.a.toString() + '}';
    }
}
