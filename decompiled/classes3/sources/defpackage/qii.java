package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qii {
    private boolean A;
    private boolean B;
    private defpackage.qie C;
    public defpackage.pdv a;
    public defpackage.qij b;
    public boolean c;
    public boolean d;
    public int e;
    private defpackage.qit f;
    private java.lang.String g;
    private java.util.List h;
    private java.util.List i;
    private defpackage.qin j;
    private defpackage.qir k;
    private int l;
    private defpackage.qiy m;
    private java.lang.String n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private java.util.List s;
    private java.lang.String t;
    private android.app.PendingIntent u;
    private android.app.PendingIntent v;
    private defpackage.qiv w;
    private boolean x;
    private defpackage.qil y;
    private boolean z;

    public final defpackage.qjd a() {
        int i = ~this.e;
        if ((29916383 & i) == 0) {
            return new defpackage.qjd(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.a, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.b, this.z, this.A, this.B, this.c, this.d, this.C, i & 238519072);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" priority");
        }
        if ((this.e & 2) == 0) {
            sb.append(" callId");
        }
        if ((this.e & 4) == 0) {
            sb.append(" actionButtons");
        }
        if ((this.e & 8) == 0) {
            sb.append(" androidAutoActionButtons");
        }
        if ((this.e & 16) == 0) {
            sb.append(" content");
        }
        if ((this.e & 64) == 0) {
            sb.append(" smallIconResId");
        }
        if ((this.e & 128) == 0) {
            sb.append(" notificationWhen");
        }
        if ((this.e & 1024) == 0) {
            sb.append(" backgroundColor");
        }
        if ((this.e & 2048) == 0) {
            sb.append(" isBackgroundColorized");
        }
        if ((this.e & 4096) == 0) {
            sb.append(" notificationPriority");
        }
        if ((this.e & 8192) == 0) {
            sb.append(" androidAutoNotificationPriority");
        }
        if ((this.e & 16384) == 0) {
            sb.append(" personReferences");
        }
        if ((this.e & 524288) == 0) {
            sb.append(" shouldTriggerExplicitInterrupt");
        }
        if ((this.e & 4194304) == 0) {
            sb.append(" isVideoCall");
        }
        if ((this.e & 8388608) == 0) {
            sb.append(" isVideoUpgradeRequest");
        }
        if ((this.e & 16777216) == 0) {
            sb.append(" shouldShowOnAndroidAuto");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null actionButtons");
        }
        this.h = list;
        this.e |= 4;
    }

    public final void c(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null androidAutoActionButtons");
        }
        this.i = list;
        this.e |= 8;
    }

    public final void d(defpackage.qie qieVar) {
        this.C = qieVar;
        this.e |= 134217728;
    }

    public final void e(int i) {
        this.r = i;
        this.e |= 8192;
    }

    public final void f(int i) {
        this.o = i;
        this.e |= 1024;
    }

    public final void g(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        this.g = str;
        this.e |= 2;
    }

    public final void h(defpackage.qil qilVar) {
        if (qilVar == null) {
            throw new java.lang.NullPointerException("Null callStyleNotificationParams");
        }
        this.y = qilVar;
        this.e |= 1048576;
    }

    public final void i(defpackage.qin qinVar) {
        if (qinVar == null) {
            throw new java.lang.NullPointerException("Null content");
        }
        this.j = qinVar;
        this.e |= 16;
    }

    public final void j(android.app.PendingIntent pendingIntent) {
        this.u = pendingIntent;
        this.e |= 65536;
    }

    public final void k(android.app.PendingIntent pendingIntent) {
        this.v = pendingIntent;
        this.e |= 131072;
    }

    public final void l(boolean z) {
        this.p = z;
        this.e |= 2048;
    }

    public final void m(boolean z) {
        this.z = z;
        this.e |= 4194304;
    }

    public final void n(boolean z) {
        this.A = z;
        this.e |= 8388608;
    }

    public final void o(defpackage.qir qirVar) {
        this.k = qirVar;
        this.e |= 32;
    }

    public final void p(java.lang.String str) {
        this.t = str;
        this.e |= 32768;
    }

    public final void q(java.lang.String str) {
        this.n = str;
        this.e |= 256;
    }

    public final void r(int i) {
        this.q = i;
        this.e |= 4096;
    }

    public final void s(defpackage.qiv qivVar) {
        this.w = qivVar;
        this.e |= 262144;
    }

    public final void t(defpackage.qiy qiyVar) {
        if (qiyVar == null) {
            throw new java.lang.NullPointerException("Null notificationWhen");
        }
        this.m = qiyVar;
        this.e |= 128;
    }

    public final void u(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null personReferences");
        }
        this.s = list;
        this.e |= 16384;
    }

    public final void v(boolean z) {
        this.B = z;
        this.e |= 16777216;
    }

    public final void w(boolean z) {
        this.x = z;
        this.e |= 524288;
    }

    public final void x(int i) {
        this.l = i;
        this.e |= 64;
    }

    public final void y(defpackage.qit qitVar) {
        if (qitVar == null) {
            throw new java.lang.NullPointerException("Null priority");
        }
        this.f = qitVar;
        this.e |= 1;
    }
}
