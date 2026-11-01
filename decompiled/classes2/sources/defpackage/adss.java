package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adss {
    public final int a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public adss(android.os.Bundle bundle) throws aoiq {
        aooh.f(bundle, "state");
        aooh.f(bundle, "source");
        java.lang.String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            defpackage.hgu.L("nav-entry-state:id");
            throw new aoiq();
        }
        this.b = string;
        aooh.f(bundle, "source");
        int i = bundle.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt("nav-entry-state:destination-id", androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) == Integer.MAX_VALUE) {
            defpackage.hgu.L("nav-entry-state:destination-id");
            throw new aoiq();
        }
        this.a = i;
        aooh.f(bundle, "source");
        this.d = gie.a(bundle, "nav-entry-state:args");
        aooh.f(bundle, "source");
        this.c = gie.a(bundle, "nav-entry-state:saved-state");
    }

    public adss(android.os.IBinder iBinder, android.os.IBinder iBinder2, int i, android.os.Bundle bundle) {
        this.b = iBinder;
        this.c = iBinder2;
        this.a = i;
        this.d = bundle;
    }

    public adss(java.lang.String str, int i, java.lang.String str2, java.util.Set set) {
        this.a = i;
        this.c = str;
        this.b = str2;
        this.d = set;
    }

    public adss(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = i;
        this.c = iArr;
        this.b = iArr2;
        this.d = iArr3;
    }

    public adss(defpackage.fvs fvsVar, int i) {
        aooh.f(fvsVar, "entry");
        this.b = fvsVar.c;
        this.a = i;
        this.d = fvsVar.a();
        android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        this.c = bundleR;
        fvsVar.l.af(bundleR);
    }
}
