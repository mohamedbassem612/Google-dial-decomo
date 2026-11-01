package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class agrn implements agye {
    final /* synthetic */ defpackage.agro a;

    public agrn(defpackage.agro agroVar) {
        j$.util.Objects.requireNonNull(agroVar);
        this.a = agroVar;
    }

    public final void a(java.lang.Throwable th) {
        java.lang.Throwable th2;
        defpackage.agro agroVar = this.a;
        final android.content.Intent intent = null;
        agroVar.o = null;
        java.lang.Throwable cause = th;
        while (true) {
            if (cause == null) {
                th2 = null;
                break;
            }
            if (cause instanceof defpackage.abyp) {
                throw null;
            }
            if (cause instanceof defpackage.abyn) {
                cause.getMessage();
                throw null;
            }
            if (cause instanceof defpackage.abyq) {
                cause.getMessage();
                throw null;
            }
            if (cause instanceof defpackage.abyo) {
                cause = new aacl(0);
            }
            if ((cause instanceof aacq) || (cause instanceof com.google.android.gms.auth.UserRecoverableAuthException)) {
                th2 = cause;
                break;
            }
            cause = cause.getCause();
        }
        if (th2 == null) {
            a.by(defpackage.agro.a.c(), "Load accounts failed due to non user recoverable error.", "com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", (char) 151, "ExpressSignInFragmentPeer.java", th);
            defpackage.agby agbyVarO = defpackage.agby.o(((aw) agroVar.f).Q, 2132020567, -2);
            agbyVarO.s(2132020569, new defpackage.ahpp(agroVar.h, 1311, "Load account error, click retry", new android.view.View.OnClickListener() { // from class: agrl
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.a.a.a();
                }
            }, 0));
            agbyVarO.h();
            return;
        }
        if (th2 instanceof aacq) {
            intent = ((aacq) th2).a();
        } else {
            com.google.android.gms.auth.UserRecoverableAuthException userRecoverableAuthException = (com.google.android.gms.auth.UserRecoverableAuthException) th2;
            android.content.Intent intent2 = userRecoverableAuthException.a;
            if (intent2 == null) {
                int i = userRecoverableAuthException.b;
                if (i == 0) {
                    throw null;
                }
                int i2 = i - 1;
                if (i2 == 0) {
                    android.util.Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                } else if (i2 == 1) {
                    android.util.Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                }
            } else {
                intent = new android.content.Intent(intent2);
            }
        }
        if (intent == null) {
            a.by(defpackage.agro.a.c(), "Load accounts failed due to user recoverable error.", "com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", (char) 168, "ExpressSignInFragmentPeer.java", th2);
            defpackage.agby.o(((aw) agroVar.f).Q, 2132020568, -2).h();
        } else {
            defpackage.agby agbyVarO2 = defpackage.agby.o(((aw) agroVar.f).Q, 2132020568, -2);
            agbyVarO2.s(2132020566, new defpackage.ahpp(agroVar.h, 1310, "Play services error, click fix", new android.view.View.OnClickListener() { // from class: agrm
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.a.a.f.aQ(intent, 29878);
                }
            }, 0));
            agbyVarO2.h();
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        aigf aigfVar = (aigf) obj;
        ahyn ahynVarH = ahyn.h(aigfVar);
        defpackage.agro agroVar = this.a;
        agroVar.n = ahynVarH;
        aift aiftVar = new aift(4);
        ailj ailjVarK = aigfVar.e().k();
        while (ailjVarK.hasNext()) {
            defpackage.agon agonVar = (defpackage.agon) ((java.util.Map.Entry) ailjVarK.next()).getKey();
            agoq agoqVar = agonVar.b;
            if (!agoqVar.j.equals("incognito")) {
                if (agoqVar.j.equals("pseudonymous")) {
                    agroVar.o = agonVar;
                } else {
                    aiftVar.i(agonVar);
                }
            }
        }
        agroVar.k.e.a(aiftVar.h());
    }

    public final /* synthetic */ void c() {
    }
}
