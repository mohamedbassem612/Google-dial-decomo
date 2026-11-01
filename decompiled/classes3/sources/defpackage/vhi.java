package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class vhi implements defpackage.vhk, defpackage.vha {
    public java.lang.String a;
    private java.util.HashSet b = null;

    public abstract java.lang.Long c();

    public abstract java.lang.String d();

    public abstract java.util.Date e();

    public final java.util.HashSet f() {
        java.util.HashSet hashSet = this.b;
        if (hashSet != null) {
            return hashSet;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        this.b = hashSet2;
        return hashSet2;
    }

    public abstract com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[] g();

    public final java.lang.String[] h() {
        return (java.lang.String[]) f().toArray(new java.lang.String[0]);
    }

    public final void i(java.lang.String str) {
        f().add(str);
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + ':' + this.a;
    }
}
