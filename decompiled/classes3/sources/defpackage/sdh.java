package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class sdh implements aonj {
    public final /* synthetic */ sdk a;
    public final /* synthetic */ defpackage.sdl b;

    public /* synthetic */ sdh(sdk sdkVar, defpackage.sdl sdlVar) {
        this.a = sdkVar;
        this.b = sdlVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        gjh gjhVar = (gjh) obj;
        aooh.f(gjhVar, "connection");
        gin ginVarA = gjhVar.a("INSERT OR REPLACE INTO `white_pages_data` (`accountName`,`accountE164PhoneNumber`,`verificationStatus`,`timestamp`) VALUES (?,?,?,?)");
        try {
            this.a.b.b(ginVarA, this.b);
            ginVarA.m();
            aooc.M(ginVarA, (java.lang.Throwable) null);
            return java.lang.Long.valueOf(dez.j(gjhVar));
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                aooc.M(ginVarA, th);
                throw th2;
            }
        }
    }
}
