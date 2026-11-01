package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akca {
    public static final java.util.Random a = new java.util.Random();

    public static aihd a(java.util.Set set, aec aecVar, defpackage.akbz akbzVar) {
        if (!aecVar.containsKey(akbzVar)) {
            return aikn.a;
        }
        aihb aihbVar = new aihb();
        for (defpackage.akbz akbzVar2 : (java.util.Set) aecVar.get(akbzVar)) {
            if (set.contains(akbzVar2)) {
                aihbVar.i(akbzVar2);
            } else {
                aihbVar.k(a(set, aecVar, akbzVar2));
            }
        }
        return aihbVar.h();
    }

    public static void b(aec aecVar, defpackage.akbz akbzVar, defpackage.akbz akbzVar2) {
        java.util.Set setNewSetFromMap = (java.util.Set) aecVar.get(akbzVar);
        if (setNewSetFromMap == null) {
            setNewSetFromMap = java.util.Collections.newSetFromMap(new aca());
            aecVar.put(akbzVar, setNewSetFromMap);
        }
        setNewSetFromMap.add(akbzVar2);
    }
}
