package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class duw {
    public final android.os.Bundle a;
    public final boolean b;
    public boolean c;

    @java.lang.Deprecated
    public int d;
    public final java.lang.CharSequence e;
    public final android.app.PendingIntent f;
    public final dvf[] g;
    private androidx.core.graphics.drawable.IconCompat h;

    public duw(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, dvf[] dvfVarArr) {
        this.c = true;
        this.h = iconCompat;
        if (iconCompat.b() == 2) {
            this.d = iconCompat.a();
        }
        this.e = defpackage.dva.c(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.g = dvfVarArr;
        this.b = true;
        this.c = true;
    }

    public final androidx.core.graphics.drawable.IconCompat a() {
        int i;
        androidx.core.graphics.drawable.IconCompat iconCompat = this.h;
        if (iconCompat != null || (i = this.d) == 0) {
            return iconCompat;
        }
        androidx.core.graphics.drawable.IconCompat iconCompatH = androidx.core.graphics.drawable.IconCompat.h(null, "", i);
        this.h = iconCompatH;
        return iconCompatH;
    }
}
