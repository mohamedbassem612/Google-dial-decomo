package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaoq {
    private static final java.lang.String a = "aaoq";
    private static android.content.Context b;
    private static final java.util.Queue c = new j$.util.concurrent.ConcurrentLinkedQueue();
    private static volatile defpackage.aaok d;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aacl */
    public static defpackage.aaok a(android.content.Context context) throws aacl {
        aais.as(context);
        java.lang.String str = a;
        android.util.Log.d(str, "preferredRenderer: null");
        if (d == null) {
            int iB = aacn.b(context, 13400000);
            if (iB != 0) {
                throw new aacl(iB);
            }
            d = e(context, 0);
            try {
                int iA = d.a();
                java.lang.String packageName = context.getPackageName();
                if (iA != 2 || packageName.equals("com.google.android.apps.photos")) {
                    android.util.Log.d(str, "not early loading native code");
                } else {
                    android.util.Log.d(str, "early loading native code");
                    try {
                        defpackage.aaok aaokVar = d;
                        aala aalaVar = new aala(d(context, 0));
                        android.os.Parcel parcelEP = aaokVar.eP();
                        yld.f(parcelEP, aalaVar);
                        aaokVar.eR(11, parcelEP);
                    } catch (android.os.RemoteException e) {
                        throw new defpackage.aaos(e);
                    } catch (java.lang.UnsatisfiedLinkError unused) {
                        android.util.Log.w(a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        b = null;
                        d = e(context, 1);
                    }
                }
                try {
                    defpackage.aaok aaokVar2 = d;
                    aala aalaVar2 = new aala(((android.content.Context) j$.util.Objects.requireNonNull(d(context, 0))).getResources());
                    android.os.Parcel parcelEP2 = aaokVar2.eP();
                    yld.f(parcelEP2, aalaVar2);
                    parcelEP2.writeInt(20010100);
                    aaokVar2.eR(6, parcelEP2);
                    while (true) {
                        java.util.Queue queue = c;
                        if (queue.isEmpty()) {
                            break;
                        }
                        try {
                            defpackage.aaop aaopVar = (defpackage.aaop) queue.poll();
                            aais.as(aaopVar);
                            defpackage.aaok aaokVar3 = d;
                            aaopVar.a();
                        } catch (android.os.RemoteException e2) {
                            throw new defpackage.aaos(e2);
                        }
                    }
                } catch (android.os.RemoteException e3) {
                    throw new defpackage.aaos(e3);
                }
            } catch (android.os.RemoteException e4) {
                throw new defpackage.aaos(e4);
            }
        }
        return d;
    }

    private static android.content.Context b(java.lang.Exception exc, android.content.Context context) {
        android.util.Log.e(a, "Failed to load maps module, use pre-Chimera", exc);
        return aacn.c(context);
    }

    private static java.lang.Object c(java.lang.Class cls) {
        try {
            return cls.newInstance();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalStateException("Unable to call the default constructor of ".concat(java.lang.String.valueOf(cls.getName())), e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException("Unable to instantiate the dynamic class ".concat(java.lang.String.valueOf(cls.getName())), e2);
        }
    }

    private static android.content.Context d(android.content.Context context, int i) {
        android.content.Context contextB;
        android.content.Context context2 = b;
        if (context2 == null) {
            java.lang.String str = 1 != i ? "com.google.android.gms.maps_core_dynamite" : "com.google.android.gms.maps_legacy_dynamite";
            try {
                contextB = aalm.c(context, aalm.a, str).c;
            } catch (java.lang.Exception e) {
                if (str.equals("com.google.android.gms.maps_dynamite")) {
                    contextB = b(e, context);
                } else {
                    try {
                        android.util.Log.d(a, "Attempting to load maps_dynamite again.");
                        contextB = aalm.c(context, aalm.a, "com.google.android.gms.maps_dynamite").c;
                    } catch (java.lang.Exception e2) {
                        contextB = b(e2, context);
                    }
                }
            }
            context2 = contextB;
            b = context2;
            if (context2 == null) {
                throw new java.lang.RuntimeException("Unable to load maps module, maps container context is null");
            }
        }
        return context2;
    }

    private static defpackage.aaok e(android.content.Context context, int i) {
        android.util.Log.i(a, "Making Creator dynamically");
        java.lang.ClassLoader classLoader = d(context, i).getClassLoader();
        try {
            aais.as(classLoader);
            android.os.IBinder iBinder = (android.os.IBinder) c(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                throw new java.lang.RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof defpackage.aaok ? (defpackage.aaok) iInterfaceQueryLocalInterface : new defpackage.aaok(iBinder);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }
}
