package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajmf {
    public static final defpackage.ajmf a = new defpackage.ajmf();
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(new defpackage.apni(new defpackage.apni((byte[]) null), (byte[]) null));

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public final synchronized void a(defpackage.ajmo ajmoVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        defpackage.apni apniVar = new defpackage.apni((defpackage.apni) atomicReference.get());
        if (ajmoVar == null) {
            throw new java.lang.NullPointerException("primitive constructor must be non-null");
        }
        defpackage.ajmp ajmpVar = new defpackage.ajmp((java.lang.Class) ajmoVar.a, (java.lang.Class) ajmoVar.b);
        ?? r1 = apniVar.b;
        if (r1.containsKey(ajmpVar)) {
            defpackage.ajmo ajmoVar2 = (defpackage.ajmo) r1.get(ajmpVar);
            if (!ajmoVar2.equals(ajmoVar) || !ajmoVar.equals(ajmoVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(ajmpVar.toString()));
            }
        } else {
            r1.put(ajmpVar, ajmoVar);
        }
        atomicReference.set(new defpackage.apni(apniVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void b(defpackage.ajmq ajmqVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        defpackage.apni apniVar = new defpackage.apni((defpackage.apni) atomicReference.get());
        ?? r1 = apniVar.a;
        java.lang.Class clsA = ajmqVar.a();
        if (r1.containsKey(clsA)) {
            defpackage.ajmq ajmqVar2 = (defpackage.ajmq) r1.get(clsA);
            if (!ajmqVar2.equals(ajmqVar) || !ajmqVar.equals(ajmqVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsA.toString()));
            }
        } else {
            r1.put(clsA, ajmqVar);
        }
        atomicReference.set(new defpackage.apni(apniVar, (byte[]) null));
    }
}
