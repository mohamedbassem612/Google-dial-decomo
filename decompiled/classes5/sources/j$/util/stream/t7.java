package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class t7 {
    public static java.util.Set a(java.util.Set set) {
        j$.util.stream.Collector.Characteristics characteristics;
        java.util.stream.Collector.Characteristics characteristics2;
        if (set == null || set.isEmpty()) {
            return set;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.Object next = set.iterator().next();
        if (next instanceof j$.util.stream.Collector.Characteristics) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.util.stream.Collector.Characteristics characteristics3 = (j$.util.stream.Collector.Characteristics) it.next();
                    if (characteristics3 == null) {
                        characteristics2 = null;
                    } else if (characteristics3 == j$.util.stream.Collector.Characteristics.CONCURRENT) {
                        characteristics2 = java.util.stream.Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics2 = characteristics3 == j$.util.stream.Collector.Characteristics.UNORDERED ? java.util.stream.Collector.Characteristics.UNORDERED : java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics2);
                } catch (java.lang.ClassCastException e) {
                    j$.util.f.a("java.util.stream.Collector.Characteristics", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof java.util.stream.Collector.Characteristics)) {
                j$.util.f.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            }
            java.util.Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    java.util.stream.Collector.Characteristics characteristics4 = (java.util.stream.Collector.Characteristics) it2.next();
                    if (characteristics4 == null) {
                        characteristics = null;
                    } else if (characteristics4 == java.util.stream.Collector.Characteristics.CONCURRENT) {
                        characteristics = j$.util.stream.Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics = characteristics4 == java.util.stream.Collector.Characteristics.UNORDERED ? j$.util.stream.Collector.Characteristics.UNORDERED : j$.util.stream.Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics);
                } catch (java.lang.ClassCastException e2) {
                    j$.util.f.a("java.util.stream.Collector.Characteristics", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
