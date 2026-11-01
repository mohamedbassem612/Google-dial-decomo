package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adsd implements defpackage.adsg {
    private static final defpackage.aify c;
    public final java.util.concurrent.atomic.AtomicBoolean a;
    public final defpackage.apnt b;
    private defpackage.ajcq d;

    static {
        java.lang.Object[] objArr = {d("Voice 1", 3, "F"), d("Voice 2", 2, "D"), d("Voice 3", 2, "B"), d("Voice 4", 3, "C"), d("Voice 5", 3, "E"), e("Voice 6", 3, "A"), e("Voice 7", 3, "B"), e("Voice 8", 2, "C"), e("Voice 9", 2, "D")};
        defpackage.ahvr.ay(objArr, 9);
        c = defpackage.aify.i(objArr, 9);
    }

    public adsd(defpackage.adoy adoyVar) {
        j$.util.Objects.requireNonNull(adoyVar);
        defpackage.apnt apntVar = new defpackage.apnt(adoyVar);
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = apntVar;
    }

    private static defpackage.adsi d(java.lang.String str, int i, java.lang.String str2) {
        java.lang.String str3 = java.lang.String.format("%s-Wavenet-%s", "en-US", str2);
        defpackage.adsh adshVar = new defpackage.adsh();
        adshVar.c = i;
        adshVar.b = "en-US";
        adshVar.b(str3);
        adshVar.a = str;
        return adshVar.a();
    }

    private static defpackage.adsi e(java.lang.String str, int i, java.lang.String str2) {
        java.lang.String str3 = java.lang.String.format("%s-Wavenet-%s", "ja-JP", str2);
        defpackage.adsh adshVar = new defpackage.adsh();
        adshVar.c = i;
        adshVar.b = "ja-JP";
        adshVar.b(str3);
        adshVar.a = str;
        return adshVar.a();
    }

    @Override // defpackage.adsg
    public final defpackage.aify a() {
        return c;
    }

    @Override // defpackage.adsg
    public final synchronized defpackage.ajcq b(defpackage.ajct ajctVar) {
        defpackage.ajcq ajcqVar = this.d;
        if (ajcqVar == null || (ajcqVar.isDone() && !this.a.get())) {
            this.d = ajctVar.submit(new defpackage.vcz(this, 10));
        }
        return this.d;
    }

    @Override // defpackage.adsg
    public final defpackage.ajcq c() {
        return new defpackage.ajdd(new java.lang.UnsupportedOperationException("GCloudSpeechSynthesizer#Synthesize should not be called."));
    }
}
