package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adyi {
    private static defpackage.ajtc a;

    public static synchronized defpackage.ajtc a(android.content.Context context, defpackage.aduu aduuVar) {
        defpackage.ajtc ajtcVar;
        java.lang.String str;
        defpackage.ajtc ajtcVar2;
        ajtcVar = a;
        if (ajtcVar == null) {
            defpackage.aais.aq("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", "ApiKey must be set.");
            defpackage.aais.aq("1:747654520220:android:0000000000000000", "ApplicationId must be set.");
            defpackage.ajtg ajtgVar = new defpackage.ajtg(aduuVar.b);
            try {
                java.lang.Object obj = defpackage.ajtc.a;
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.ajta.a;
                if (context.getApplicationContext() instanceof android.app.Application) {
                    android.app.Application application = (android.app.Application) context.getApplicationContext();
                    java.util.concurrent.atomic.AtomicReference atomicReference2 = defpackage.ajta.a;
                    if (atomicReference2.get() == null) {
                        defpackage.ajta ajtaVar = new defpackage.ajta();
                        if (defpackage.anty.aq(atomicReference2, ajtaVar)) {
                            defpackage.aaea.b(application);
                            defpackage.aaea.a.a(ajtaVar);
                        }
                    }
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                synchronized (defpackage.ajtc.a) {
                    java.util.Map map = defpackage.ajtc.b;
                    defpackage.aais.ao(!map.containsKey("CHIME_ANDROID_SDK"), "FirebaseApp name CHIME_ANDROID_SDK already exists!");
                    defpackage.aais.at(context, "Application context cannot be null.");
                    ajtcVar2 = new defpackage.ajtc(context, "CHIME_ANDROID_SDK", ajtgVar);
                    map.put("CHIME_ANDROID_SDK", ajtcVar2);
                }
                ajtcVar2.h();
                ajtcVar = ajtcVar2;
            } catch (java.lang.IllegalStateException unused) {
                java.lang.Object obj2 = defpackage.ajtc.a;
                synchronized (obj2) {
                    java.util.Map map2 = defpackage.ajtc.b;
                    defpackage.ajtc ajtcVar3 = (defpackage.ajtc) map2.get("CHIME_ANDROID_SDK");
                    if (ajtcVar3 == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        synchronized (obj2) {
                            try {
                                java.util.Iterator it = map2.values().iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((defpackage.ajtc) it.next()).e());
                                }
                                java.util.Collections.sort(arrayList);
                                if (arrayList.isEmpty()) {
                                    str = "";
                                } else {
                                    str = "Available app names: " + android.text.TextUtils.join(", ", arrayList);
                                }
                                throw new java.lang.IllegalStateException(java.lang.String.format("FirebaseApp with name %s doesn't exist. %s", "CHIME_ANDROID_SDK", str));
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                    }
                    ((defpackage.ajvp) ajtcVar3.f.a()).c();
                    ajtcVar = ajtcVar3;
                }
            }
            a = ajtcVar;
        }
        return ajtcVar;
    }
}
