package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vzc implements emj {
    private final ojo a;
    private final agwz b;
    private final defpackage.vzd c;
    private final ajct d;
    private final ahpz e;
    private final oko f;
    private int g;
    private boolean h;
    private boolean i;

    public vzc(ojo ojoVar, aogc aogcVar, ajct ajctVar, ahpz ahpzVar, defpackage.vzd vzdVar, oko okoVar) {
        this.a = ojoVar;
        this.d = ajctVar;
        this.e = ahpzVar;
        this.c = vzdVar;
        this.f = okoVar;
        this.b = new defpackage.vzb(this, ahpzVar, ajctVar, aogcVar);
    }

    public final void b(emx emxVar) {
        emxVar.P().d(this);
    }

    public final void e(emx emxVar) {
        if (!this.h) {
            try {
                this.a.l(android.provider.VoicemailContract.Status.CONTENT_URI, true, this.b);
                this.i = true;
            } catch (java.lang.SecurityException e) {
                a.bq(vze.a.d(), "not default dialer or missing voicemail permissions", "com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl$RegisteredOwnerLifecycleObserver", "onStart", (char) 498, "VoicemailStatusDataServiceImpl.java", e, zct.b);
            }
            this.f.V(this.c, 1);
            this.h = true;
        }
        this.g++;
    }

    public final void f(emx emxVar) {
        int i = this.g - 1;
        this.g = i;
        if (this.h && i == 0) {
            if (this.i) {
                this.a.m(this.b);
            }
            this.f.V(this.c, 0);
            this.h = false;
        }
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
