package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahem implements ahmi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public ahem(ahmk ahmkVar, ajat ajatVar, defpackage.akxm akxmVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = ajatVar;
        this.b = akxmVar;
        j$.util.Objects.requireNonNull(ahmkVar);
    }

    public final ajcq a(ajcq ajcqVar, j$.time.Duration duration) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(duration, "duration");
            return ((defpackage.ahex) this.b).b(ajcqVar, (java.lang.String) this.a, 1, duration);
        }
        if (i == 1) {
            return ajcm.a;
        }
        if (i != 2) {
            return i != 3 ? ajcm.a : ajcm.a;
        }
        aooh.f(duration, "duration");
        return ((defpackage.ahex) this.b).b(ajcqVar, (java.lang.String) this.a, 2, duration);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ajat, java.lang.Object] */
    public final ajcq b() {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.ahex) this.b).c((java.lang.String) this.a, 1);
        }
        if (i == 1) {
            return this.a.a(this.b);
        }
        if (i == 2) {
            return ((defpackage.ahex) this.b).c((java.lang.String) this.a, 2);
        }
        ?? r1 = this.a;
        java.lang.Object obj = this.b;
        return i != 3 ? r1.a(obj) : r1.a(obj);
    }

    public ahem(defpackage.ahex ahexVar, java.lang.String str, int i) {
        this.$cid = i;
        this.b = ahexVar;
        this.a = str;
    }

    public ahem(aogc aogcVar, ajat ajatVar, defpackage.aguu aguuVar, int i) {
        this.$cid = i;
        this.a = ajatVar;
        this.b = aguuVar;
        j$.util.Objects.requireNonNull(aogcVar);
    }

    public ahem(ahmk ahmkVar, ajat ajatVar, defpackage.akxm akxmVar, int i) {
        this.$cid = i;
        this.a = ajatVar;
        this.b = akxmVar;
        j$.util.Objects.requireNonNull(ahmkVar);
    }
}
