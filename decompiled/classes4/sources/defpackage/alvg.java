package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvg {
    public static final java.util.Map a = ajsz.aO(new aoiu[]{new aoiu("Disclosure", "Greeting"), new aoiu("DisclosureUrgent", "Greeting"), new aoiu("AskWhoIsThis", "Who"), new aoiu("AskWhoLookingFor", "Who"), new aoiu("AskCompany", "Company"), new aoiu("AskReason", "Reason"), new aoiu("AskIfSales", "Pitch"), new aoiu("AskReferenceNumber", "Ref"), new aoiu("AskIfEmergency", "Emergency"), new aoiu("AskCallbackNumber", "Callback")});
    private static final java.util.Set m = ajsz.cW(new defpackage.alvd[]{defpackage.alvd.h, defpackage.alvd.i});
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public defpackage.alnr l;
    private boolean o;
    public final java.util.concurrent.locks.ReentrantLock b = new java.util.concurrent.locks.ReentrantLock();
    public defpackage.alvd c = defpackage.alvd.a;
    public final java.util.List d = new java.util.ArrayList();
    private java.lang.String n = "";
    public boolean e = true;

    public static final java.lang.String o(defpackage.alvf alvfVar) {
        if (alvfVar.f != 1) {
            return "[Remote] " + alvfVar.a + '\n';
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[Bot] ");
        java.lang.String str = alvfVar.b;
        if (str == null) {
            str = alvfVar.a;
        }
        sb.append(str);
        if (alvfVar.e) {
            sb.append(" [Interrupted]");
        }
        sb.append('\n');
        return sb.toString();
    }

    public final int a() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return this.j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int b() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return this.k;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final defpackage.alnr c() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return this.l;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final java.lang.String d(boolean z) {
        return aoov.ab(aoov.x(ajsz.cr(this.d, "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new skg(z, 9), 30)).toString(), 2000);
    }

    public final java.lang.String e() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return this.n;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.i = false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void g() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.h = false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void h(java.lang.String str) {
        aooh.f(str, "value");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.n = str;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i(boolean z) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.o = z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void j(boolean z) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.e = z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void k(defpackage.alvd alvdVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.c = alvdVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean l() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return this.o;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean m() {
        return m.contains(this.c);
    }

    public final void n() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        reentrantLock.unlock();
    }
}
