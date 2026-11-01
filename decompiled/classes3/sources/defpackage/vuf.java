package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vuf implements emj {
    final /* synthetic */ agwz a;
    final /* synthetic */ defpackage.vul b;
    private boolean c;
    private boolean d;

    public vuf(defpackage.vul vulVar, agwz agwzVar) {
        this.a = agwzVar;
        j$.util.Objects.requireNonNull(vulVar);
        this.b = vulVar;
        this.c = false;
        this.d = false;
    }

    public final void c(emx emxVar) {
        if (((java.lang.Boolean) this.b.j.a()).booleanValue()) {
            this.d = true;
        }
    }

    public final void e(emx emxVar) {
        try {
            this.b.f.l(android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL, true, this.a);
        } catch (java.lang.SecurityException e) {
            a.bq(defpackage.vul.a.d(), "Could not register content observers due to due missing permissions", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VisualVoicemailDataServiceImpl$2", "onStart", (char) 168, "VisualVoicemailDataServiceImpl.java", e, zct.b);
        }
        if (this.c) {
            this.c = false;
            defpackage.vul vulVar = this.b;
            if (((java.lang.Boolean) vulVar.i.a()).booleanValue()) {
                vulVar.o.t(aiql.z((java.lang.Object) null), new agxj("VisualVoicemailWithViews"));
            }
        }
    }

    public final void f(emx emxVar) {
        defpackage.vul vulVar = this.b;
        vulVar.f.m(this.a);
        if (((java.lang.Boolean) vulVar.i.a()).booleanValue()) {
            vulVar.b.b();
            this.c = true;
        }
    }

    public final void fn(emx emxVar) {
        if (this.d) {
            this.d = false;
            defpackage.vul vulVar = this.b;
            if (((java.lang.Boolean) vulVar.j.a()).booleanValue()) {
                vulVar.o.s(ajcm.a, new agxj("VisualVoicemailWithViews"));
            }
        }
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void b(emx emxVar) {
    }
}
