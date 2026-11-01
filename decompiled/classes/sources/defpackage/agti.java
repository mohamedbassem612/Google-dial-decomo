package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agti {
    public static final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(123051698);
    public final defpackage.aca b = new defpackage.aca();
    public final defpackage.aca c = new defpackage.aca();
    private final java.lang.String d;

    public agti(java.lang.String str) {
        this.d = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final int a(java.lang.Object obj) throws afeb {
        defpackage.afec.c();
        java.lang.Integer num = (java.lang.Integer) this.c.get(obj.getClass());
        defpackage.ahvr.cc(num != null, "The callback %s has not been registered", obj.getClass());
        defpackage.ahvr.cc(b(num.intValue()) == obj, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", obj.getClass());
        return num.intValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final java.lang.Object b(int i) throws afeb {
        defpackage.afec.c();
        java.lang.Object obj = this.b.get(java.lang.Integer.valueOf(i));
        if (obj == null) {
            for (java.util.Map.Entry entry : this.c.entrySet()) {
                if (((java.lang.Integer) entry.getValue()).intValue() == i) {
                    throw new java.lang.NullPointerException("Callback not re-registered for: ".concat(java.lang.String.valueOf(((java.lang.Class) entry.getKey()).getName())));
                }
            }
        }
        defpackage.ahvr.ck(obj, "No callback existed for %s", i);
        return obj;
    }

    public final void c() {
        defpackage.afec.c();
        this.b.clear();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void d(java.lang.Object obj) throws afeb {
        defpackage.afec.c();
        defpackage.aca acaVar = this.c;
        java.lang.Class<?> cls = obj.getClass();
        if (acaVar.containsKey(cls)) {
            java.lang.Integer num = (java.lang.Integer) acaVar.get(cls);
            num.intValue();
            defpackage.ahvr.cc(this.b.put(num, obj) == null, "Attempted to register the callback class %s twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", cls);
        } else {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(a.getAndIncrement());
            acaVar.put(cls, numValueOf);
            this.b.put(numValueOf, obj);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void e(android.os.Bundle bundle) throws afeb {
        defpackage.afec.c();
        if (bundle != null) {
            java.lang.String str = this.d;
            java.lang.String strConcat = "CallbackIdMap.classes".concat(str);
            defpackage.ahvr.bZ(bundle.containsKey(strConcat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            java.lang.String[] stringArray = bundle.getStringArray(strConcat);
            int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(str));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    java.lang.Integer num = (java.lang.Integer) this.c.put(java.lang.Class.forName(stringArray[i]), java.lang.Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int iIntValue = num.intValue();
                        int i2 = intArray[i];
                        defpackage.ahvr.cf(iIntValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], java.lang.Integer.valueOf(i2), num);
                    }
                } catch (java.lang.ClassNotFoundException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
    }

    public final void f(android.os.Bundle bundle) {
        defpackage.afec.c();
        java.lang.String str = this.d;
        java.lang.String strConcat = "CallbackIdMap.classes".concat(str);
        defpackage.ahvr.cc(!bundle.containsKey(strConcat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", strConcat);
        defpackage.aca acaVar = this.c;
        int i = acaVar.d;
        java.lang.String[] strArr = new java.lang.String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (java.util.Map.Entry entry : acaVar.entrySet()) {
            strArr[i2] = ((java.lang.Class) entry.getKey()).getName();
            iArr[i2] = ((java.lang.Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(strConcat, strArr);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(str), iArr);
    }

    public final void g() {
        defpackage.afec.c();
        for (java.util.Map.Entry entry : this.c.entrySet()) {
            defpackage.ahvr.cc(this.b.containsKey((java.lang.Integer) entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
    }
}
