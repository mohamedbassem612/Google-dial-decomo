package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
final class emg {
    final java.util.Map a = new java.util.HashMap();
    final java.util.Map b;

    public emg(java.util.Map map) {
        this.b = map;
        for (java.util.Map.Entry entry : map.entrySet()) {
            emp empVar = (emp) entry.getValue();
            java.util.List arrayList = (java.util.List) this.a.get(empVar);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                this.a.put(empVar, arrayList);
            }
            arrayList.add((defpackage.emh) entry.getKey());
        }
    }

    public static void a(java.util.List list, emx emxVar, emp empVar, java.lang.Object obj) {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.emh emhVar = (defpackage.emh) list.get(size);
            try {
                int i = emhVar.a;
                if (i == 0) {
                    emhVar.b.invoke(obj, null);
                } else if (i != 1) {
                    emhVar.b.invoke(obj, emxVar, empVar);
                } else {
                    emhVar.b.invoke(obj, emxVar);
                }
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException(e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
