package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dva {
    public final android.app.Notification B;

    @java.lang.Deprecated
    public final java.util.ArrayList C;
    public final android.content.Context a;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public android.app.PendingIntent g;
    public androidx.core.graphics.drawable.IconCompat h;
    public int i;
    public int j;
    public defpackage.dvk l;
    int m;
    public boolean n;
    public java.lang.String o;
    public boolean p;
    public java.lang.String r;
    public android.os.Bundle s;
    public android.app.Notification v;
    public java.lang.String w;
    public java.lang.String x;
    public defpackage.dvy y;
    public long z;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public boolean k = true;
    public boolean q = false;
    public int t = 0;
    public int u = 0;
    public int A = 0;

    public dva(android.content.Context context, java.lang.String str) {
        android.app.Notification notification = new android.app.Notification();
        this.B = notification;
        this.a = context;
        this.w = str;
        notification.when = java.lang.System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.C = new java.util.ArrayList();
    }

    public static java.lang.CharSequence c(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final android.app.Notification a() {
        android.os.Bundle bundle;
        izg izgVar = new izg(this);
        defpackage.dvk dvkVar = ((defpackage.dva) izgVar.b).l;
        if (dvkVar != null) {
            dvkVar.b(izgVar);
        }
        android.app.Notification notificationBuild = ((android.app.Notification.Builder) izgVar.a).build();
        if (dvkVar != null && (bundle = notificationBuild.extras) != null) {
            dvkVar.e(bundle);
        }
        return notificationBuild;
    }

    public final android.os.Bundle b() {
        android.os.Bundle bundle = this.s;
        if (bundle != null) {
            return bundle;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        this.s = bundle2;
        return bundle2;
    }

    public final void d(int i, boolean z) {
        android.app.Notification notification = this.B;
        if (z) {
            notification.flags |= i;
        } else {
            notification.flags &= ~i;
        }
    }

    public final void e(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this.b.add(new defpackage.duw(androidx.core.graphics.drawable.IconCompat.h(null, "", i), charSequence, pendingIntent, new android.os.Bundle(), null));
    }

    public final void f(defpackage.duw duwVar) {
        this.b.add(duwVar);
    }

    public final void g(java.lang.CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void h(java.lang.CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void i(int i) {
        android.app.Notification notification = this.B;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void j(android.app.PendingIntent pendingIntent) {
        this.B.deleteIntent = pendingIntent;
    }

    public final void k() {
        this.p = true;
    }

    public final void l(android.graphics.Bitmap bitmap) {
        this.h = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.f(bitmap);
    }

    public final void m() {
        this.k = true;
    }

    public final void n(int i) {
        this.B.icon = i;
    }

    public final void o(defpackage.dvk dvkVar) {
        if (this.l != dvkVar) {
            this.l = dvkVar;
            if (dvkVar == null || dvkVar.c == this) {
                return;
            }
            dvkVar.c = this;
            defpackage.dva dvaVar = dvkVar.c;
            if (dvaVar != null) {
                dvaVar.o(dvkVar);
            }
        }
    }

    public final void p(java.lang.CharSequence charSequence) {
        this.B.tickerText = c(charSequence);
    }

    public final void q() {
        this.z = 1800000L;
    }

    public final void r(long j) {
        this.B.when = j;
    }

    public final void s(int i, boolean z) {
        this.m = 0;
        this.n = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final void t(defpackage.aaj aajVar) {
        if (aajVar != null) {
            java.lang.Object obj = aajVar.d;
            java.lang.String str = (java.lang.String) obj;
            this.x = str;
            if (this.y == null && obj != null) {
                this.y = new defpackage.dvy(str);
            }
            if (this.e == null) {
                h(aajVar.g);
            }
        }
    }
}
