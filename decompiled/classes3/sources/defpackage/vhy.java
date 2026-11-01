package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhy {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapConnection");
    private defpackage.vid c;
    private defpackage.vhg d;
    private defpackage.vin e;
    private final java.util.Set f = new acc(0);
    private final java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger(0);
    private java.lang.String b = null;

    public vhy(defpackage.vid vidVar) {
        this.c = vidVar;
    }

    private static java.lang.String h(java.lang.String str) {
        return new java.lang.String(android.util.Base64.decode(str, 0));
    }

    private final void i() {
        this.e = new defpackage.vin(((defpackage.vhh) this.d).h);
    }

    private final void j() {
        java.util.List<defpackage.vil> listC = c("CAPABILITY");
        java.util.Set set = this.f;
        set.clear();
        aihd aihdVarO = aihd.o(this.c.i.a.f);
        for (defpackage.vil vilVar : listC) {
            if (!vilVar.r()) {
                for (int i = 0; i < vilVar.e(); i++) {
                    java.lang.String strB = vilVar.j(i).b();
                    if (aihdVarO == null) {
                        set.add(strB);
                    } else if (!aihdVarO.contains(strB)) {
                        set.add(strB);
                    }
                }
            }
        }
        a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapConnection", "queryCapability", 307, "ImapConnection.java").y("Capabilities: %s", set);
    }

    public final defpackage.vil a() {
        return this.e.a(false);
    }

    public final java.util.List b(java.lang.String str) {
        this.d.c(str);
        this.d.c("\r\n");
        this.d.a();
        return d();
    }

    public final java.util.List c(java.lang.String str) {
        g(str, new defpackage.vih[0]);
        return d();
    }

    public final java.util.List d() throws java.lang.Exception {
        defpackage.vil vilVarA;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            vilVarA = this.e.a(false);
            arrayList.add(vilVarA);
            if (vilVarA.r()) {
                break;
            }
        } while (!vilVarA.c);
        if (vilVarA.k(0, "OK", false) || vilVarA.c) {
            return arrayList;
        }
        java.lang.String string = vilVarA.toString();
        java.lang.String strB = (!vilVarA.q() ? defpackage.viq.c : vilVarA.j(0)).b();
        java.lang.String strB2 = vilVarA.o().b();
        java.lang.String strB3 = (!vilVarA.n().e("ALERT") ? defpackage.viq.c : vilVarA.j(2)).b();
        a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapConnection", "getCommandResponses", 395, "ImapConnection.java").N("status: %s, statusMessage: %s, alert: %s, responseCode: %s", strB, strB2, strB3, vilVarA.n().b());
        throw new defpackage.vib(string, strB, strB2, strB3);
    }

    public final void e() {
        if (this.d != null) {
            try {
                g("LOGOUT", new defpackage.vih[0]);
                if (!this.e.a(true).k(0, "BYE", false)) {
                    a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapConnection", "logout", 142, "ImapConnection.java").v("Server did not respond LOGOUT with BYE");
                }
                if (!this.e.a(false).k(0, "OK", false)) {
                    a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapConnection", "logout", 149, "ImapConnection.java").v("Server did not respond OK after LOGOUT");
                }
            } catch (java.io.IOException | defpackage.vgv e) {
                a.bq(a.c(), "Error while logging out", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapConnection", "logout", (char) 152, "ImapConnection.java", e, zct.b);
            }
            defpackage.vhg vhgVar = this.d;
            try {
                ((defpackage.vhh) vhgVar).h.close();
            } catch (java.lang.Exception unused) {
            }
            try {
                ((defpackage.vhh) vhgVar).i.close();
            } catch (java.lang.Exception unused2) {
            }
            try {
                ((defpackage.vhh) vhgVar).g.close();
            } catch (java.lang.Exception unused3) {
            }
            defpackage.vhh vhhVar = (defpackage.vhh) vhgVar;
            vhhVar.h = null;
            vhhVar.i = null;
            vhhVar.g = null;
            this.d = null;
        }
        this.e = null;
        this.c = null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x017d */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v118, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120, types: [aoin, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() throws defpackage.vgv {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhy.f():void");
    }

    public final void g(java.lang.String str, defpackage.vih... vihVarArr) {
        f();
        this.d.c(java.lang.Integer.toString(this.g.incrementAndGet()) + ' ' + str);
        for (defpackage.vih vihVar : vihVarArr) {
            this.d.c(" ");
            vihVar.c(this.d, this.e);
        }
        this.d.c("\r\n");
        this.d.a();
    }
}
