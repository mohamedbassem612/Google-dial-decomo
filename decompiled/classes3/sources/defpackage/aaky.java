package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaky {
    public android.os.Bundle a;
    public java.util.LinkedList b;
    public defpackage.aaog c;
    protected defpackage.aprf e;
    private final android.view.ViewGroup f;
    private final android.content.Context g;
    private final com.google.android.gms.maps.GoogleMapOptions h;
    private final defpackage.aprf i = new defpackage.aprf(this);
    public final java.util.List d = new java.util.ArrayList();

    public aaky(android.view.ViewGroup viewGroup, android.content.Context context, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        this.f = viewGroup;
        this.g = context;
        this.h = googleMapOptions;
    }

    public final void a(int i) {
        while (!this.b.isEmpty() && ((defpackage.aakx) this.b.getLast()).a() >= i) {
            this.b.removeLast();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aacl */
    public final void b(android.os.Bundle bundle, defpackage.aakx aakxVar) {
        defpackage.aaom aaomVar;
        if (this.c != null) {
            aakxVar.b();
            return;
        }
        java.util.LinkedList linkedList = this.b;
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
            this.b = linkedList;
        }
        linkedList.add(aakxVar);
        if (bundle != null) {
            android.os.Bundle bundle2 = this.a;
            if (bundle2 == null) {
                this.a = (android.os.Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        defpackage.aprf aprfVar = this.i;
        this.e = aprfVar;
        if (aprfVar == null || this.c != null) {
            return;
        }
        try {
            android.content.Context context = this.g;
            defpackage.aaoi.a(context);
            defpackage.aaok aaokVarA = defpackage.aaoq.a(context);
            aala aalaVar = new aala(context);
            com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.h;
            android.os.Parcel parcelEP = aaokVarA.eP();
            yld.f(parcelEP, aalaVar);
            yld.d(parcelEP, reflectedParcelable);
            android.os.Parcel parcelEQ = aaokVarA.eQ(3, parcelEP);
            android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
            if (strongBinder == null) {
                aaomVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                aaomVar = iInterfaceQueryLocalInterface instanceof defpackage.aaom ? (defpackage.aaom) iInterfaceQueryLocalInterface : new defpackage.aaom(strongBinder);
            }
            parcelEQ.recycle();
            if (aaomVar != null) {
                defpackage.aprf aprfVar2 = this.e;
                defpackage.aaog aaogVar = new defpackage.aaog(this.f, aaomVar);
                java.lang.Object obj = aprfVar2.a;
                ((defpackage.aaky) obj).c = aaogVar;
                java.util.Iterator it = ((defpackage.aaky) obj).b.iterator();
                while (it.hasNext()) {
                    ((defpackage.aakx) it.next()).b();
                }
                ((defpackage.aaky) obj).b.clear();
                ((defpackage.aaky) obj).a = null;
                java.util.List list = this.d;
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    this.c.a((jxt) it2.next());
                }
                list.clear();
            }
        } catch (android.os.RemoteException e) {
            throw new defpackage.aaos(e);
        } catch (aacl unused) {
        }
    }
}
