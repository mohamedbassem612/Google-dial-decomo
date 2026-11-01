package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apsl extends defpackage.apsm {
    private static final defpackage.apru a = new defpackage.apsl();

    public apsl() {
        super(defpackage.apsq.b);
        c("Content-Type", defpackage.apsj.b);
        c("Content-Length", defpackage.apsf.b);
        c("Content-Transfer-Encoding", defpackage.apsi.b);
        c("Content-Disposition", defpackage.apsc.b);
        c("Content-ID", defpackage.apsd.b);
        c("Content-MD5", defpackage.apsh.b);
        c("Content-Description", defpackage.apsb.b);
        c("Content-Language", defpackage.apse.b);
        c("Content-Location", defpackage.apsg.b);
        c("MIME-Version", defpackage.apsp.b);
        defpackage.apru apruVar = defpackage.apsk.b;
        c("Date", apruVar);
        c("Resent-Date", apruVar);
        defpackage.apru apruVar2 = defpackage.apso.b;
        c("From", apruVar2);
        c("Resent-From", apruVar2);
        defpackage.apru apruVar3 = defpackage.apsn.b;
        c("Sender", apruVar3);
        c("Resent-Sender", apruVar3);
        defpackage.apru apruVar4 = defpackage.aprz.b;
        c("To", apruVar4);
        c("Resent-To", apruVar4);
        c("Cc", apruVar4);
        c("Resent-Cc", apruVar4);
        c("Bcc", apruVar4);
        c("Resent-Bcc", apruVar4);
        c("Reply-To", apruVar4);
    }

    public static defpackage.aprx b(java.lang.String str) throws defpackage.aprn {
        defpackage.aprr aprrVar = defpackage.aprr.b;
        defpackage.aptw aptwVar = new defpackage.aptw(str.length());
        for (int i = 0; i < str.length(); i++) {
            aptwVar.b((byte) str.charAt(i));
        }
        return a.a(defpackage.aptv.d.c(aptwVar), aprrVar);
    }
}
