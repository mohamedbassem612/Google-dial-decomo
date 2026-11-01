package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaoi {
    private static final java.lang.String a = "aaoi";
    private static boolean b = false;
    private static int c = 1;

    private aaoi() {
    }

    public static synchronized void a(android.content.Context context) {
        b(context);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e A[Catch: RemoteException -> 0x0096, all -> 0x00c2, TryCatch #3 {RemoteException -> 0x0096, blocks: (B:28:0x0078, B:30:0x007e, B:31:0x0080), top: B:58:0x0078, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    public static synchronized void b(android.content.Context context) {
        defpackage.aaoj aaojVar;
        int i;
        java.lang.String str;
        aais.at(context, "Context is null");
        java.lang.String str2 = a;
        android.util.Log.d(str2, "preferredRenderer: null");
        if (b) {
            return;
        }
        try {
            defpackage.aaok aaokVarA = defpackage.aaoq.a(context);
            try {
                android.os.Parcel parcelEQ = aaokVarA.eQ(4, aaokVarA.eP());
                android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
                defpackage.aaot aaotVar = null;
                if (strongBinder == null) {
                    aaojVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    aaojVar = iInterfaceQueryLocalInterface instanceof defpackage.aaoj ? (defpackage.aaoj) iInterfaceQueryLocalInterface : new defpackage.aaoj(strongBinder);
                }
                parcelEQ.recycle();
                aais.as(aaojVar);
                aaoo.b = aaojVar;
                android.os.Parcel parcelEQ2 = aaokVarA.eQ(5, aaokVarA.eP());
                android.os.IBinder strongBinder2 = parcelEQ2.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    aaotVar = iInterfaceQueryLocalInterface2 instanceof defpackage.aaot ? (defpackage.aaot) iInterfaceQueryLocalInterface2 : new defpackage.aaot(strongBinder2);
                }
                parcelEQ2.recycle();
                if (aaoo.c != null) {
                    b = true;
                    if (aaokVarA.a() == 2) {
                        c = 2;
                    }
                    aala aalaVar = new aala(context);
                    android.os.Parcel parcelEP = aaokVarA.eP();
                    yld.f(parcelEP, aalaVar);
                    parcelEP.writeInt(0);
                    aaokVarA.eR(10, parcelEP);
                    i = c;
                    if (i != 1) {
                        str = "LEGACY";
                    } else if (i != 2) {
                        str = "null";
                    } else {
                        str = "LATEST";
                    }
                    android.util.Log.d(str2, "loadedRenderer: ".concat(str));
                    return;
                }
                aais.at(aaotVar, "delegate must not be null");
                aaoo.c = aaotVar;
                b = true;
                try {
                    if (aaokVarA.a() == 2) {
                        c = 2;
                    }
                    aala aalaVar2 = new aala(context);
                    android.os.Parcel parcelEP2 = aaokVarA.eP();
                    yld.f(parcelEP2, aalaVar2);
                    parcelEP2.writeInt(0);
                    aaokVarA.eR(10, parcelEP2);
                } catch (android.os.RemoteException e) {
                    str2 = a;
                    android.util.Log.e(str2, "Failed to retrieve renderer type or log initialization.", e);
                }
                i = c;
                if (i != 1) {
                    str = "LEGACY";
                } else if (i != 2) {
                    str = "null";
                } else {
                    str = "LATEST";
                }
                android.util.Log.d(str2, "loadedRenderer: ".concat(str));
                return;
            } catch (android.os.RemoteException e2) {
                throw new defpackage.aaos(e2);
            }
        } catch (aacl unused) {
            return;
        }
        throw th;
    }
}
