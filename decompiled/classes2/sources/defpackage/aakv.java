package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aakv implements aakx {
    final /* synthetic */ android.os.Bundle a;
    final /* synthetic */ aaky b;

    public aakv(aaky aakyVar, android.os.Bundle bundle) {
        this.a = bundle;
        j$.util.Objects.requireNonNull(aakyVar);
        this.b = aakyVar;
    }

    public final int a() {
        return 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void b() throws aaos {
        aalb aakzVar;
        aaog aaogVar = this.b.c;
        android.os.Bundle bundle = this.a;
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            aaoo.e(bundle, bundle2);
            aaom aaomVar = aaogVar.c;
            android.os.Parcel parcelEP = aaomVar.eP();
            yld.d(parcelEP, bundle2);
            aaomVar.eR(2, parcelEP);
            aaoo.e(bundle2, bundle);
            android.os.Parcel parcelEQ = aaomVar.eQ(8, aaomVar.eP());
            android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
            if (strongBinder == null) {
                aakzVar = null;
            } else {
                aalb aalbVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                aakzVar = aalbVarQueryLocalInterface instanceof aalb ? aalbVarQueryLocalInterface : new aakz(strongBinder);
            }
            parcelEQ.recycle();
            aaogVar.b = (android.view.View) defpackage.aala.a(aakzVar);
            android.view.ViewGroup viewGroup = aaogVar.a;
            viewGroup.removeAllViews();
            viewGroup.addView(aaogVar.b);
        } catch (android.os.RemoteException e) {
            throw new aaos(e);
        }
    }
}
