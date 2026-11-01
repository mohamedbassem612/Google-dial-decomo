package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adaf implements defpackage.amyv {
    private final defpackage.adae a;

    public adaf(defpackage.adae adaeVar) {
        this.a = adaeVar;
    }

    public static android.content.Context c(defpackage.adae adaeVar) {
        java.lang.Object obj = adaeVar.a;
        defpackage.aooc.ap(obj);
        return (android.content.Context) obj;
    }

    @Override // defpackage.aoin, defpackage.aoim
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final android.content.Context a() {
        return c(this.a);
    }
}
