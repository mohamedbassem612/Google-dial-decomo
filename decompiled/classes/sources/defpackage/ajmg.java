package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajmg {
    public static final defpackage.ajmg a = (defpackage.ajmg) defpackage.ajne.a(new defpackage.ajhl(11));
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(new defpackage.ajnb(new defpackage.apdi((byte[]) null)));

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void a(defpackage.ajmk ajmkVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        defpackage.apdi apdiVar = new defpackage.apdi((defpackage.ajnb) atomicReference.get());
        ?? r2 = apdiVar.b;
        java.lang.Object obj = ajmkVar.a;
        if (r2.containsKey(obj)) {
            defpackage.ajmk ajmkVar2 = (defpackage.ajmk) r2.get(obj);
            if (!ajmkVar2.equals(ajmkVar) || !ajmkVar.equals(ajmkVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(obj.toString()));
            }
        } else {
            r2.put(obj, ajmkVar);
        }
        atomicReference.set(new defpackage.ajnb(apdiVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void b(defpackage.ajmk ajmkVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        defpackage.apdi apdiVar = new defpackage.apdi((defpackage.ajnb) atomicReference.get());
        ?? r2 = apdiVar.c;
        java.lang.Object obj = ajmkVar.a;
        if (r2.containsKey(obj)) {
            defpackage.ajmk ajmkVar2 = (defpackage.ajmk) r2.get(obj);
            if (!ajmkVar2.equals(ajmkVar) || !ajmkVar.equals(ajmkVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat((java.lang.String) obj));
            }
        } else {
            r2.put(obj, ajmkVar);
        }
        atomicReference.set(new defpackage.ajnb(apdiVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(defpackage.ajmk ajmkVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        defpackage.apdi apdiVar = new defpackage.apdi((defpackage.ajnb) atomicReference.get());
        ?? r2 = apdiVar.d;
        java.lang.Object obj = ajmkVar.a;
        if (r2.containsKey(obj)) {
            defpackage.ajmk ajmkVar2 = (defpackage.ajmk) r2.get(obj);
            if (!ajmkVar2.equals(ajmkVar) || !ajmkVar.equals(ajmkVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(obj.toString()));
            }
        } else {
            r2.put(obj, ajmkVar);
        }
        atomicReference.set(new defpackage.ajnb(apdiVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void d(defpackage.ajmk ajmkVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        defpackage.apdi apdiVar = new defpackage.apdi((defpackage.ajnb) atomicReference.get());
        ?? r2 = apdiVar.a;
        java.lang.Object obj = ajmkVar.a;
        if (r2.containsKey(obj)) {
            defpackage.ajmk ajmkVar2 = (defpackage.ajmk) r2.get(obj);
            if (!ajmkVar2.equals(ajmkVar) || !ajmkVar.equals(ajmkVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat((java.lang.String) obj));
            }
        } else {
            r2.put(obj, ajmkVar);
        }
        atomicReference.set(new defpackage.ajnb(apdiVar));
    }

    public final defpackage.aiql e(akxm akxmVar, ajfk ajfkVar) {
        return ((defpackage.ajnb) this.b.get()).a(akxmVar, ajfkVar);
    }

    public final akxm f(defpackage.aiql aiqlVar, ajfk ajfkVar) {
        return ((defpackage.ajnb) this.b.get()).e(aiqlVar, ajfkVar);
    }

    public final defpackage.ajsz g(defpackage.aogc aogcVar) {
        return ((defpackage.ajnb) this.b.get()).c(aogcVar);
    }

    public final defpackage.aogc h(defpackage.ajsz ajszVar) {
        return ((defpackage.ajnb) this.b.get()).f(ajszVar);
    }
}
