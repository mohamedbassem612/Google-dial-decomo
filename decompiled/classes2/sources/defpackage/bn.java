package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bn implements bl {
    final /* synthetic */ bo a;

    public bn(bo boVar) {
        this.a = boVar;
    }

    public final boolean g(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        boolean zAd;
        int i;
        bo boVar = this.a;
        if (bo.Z(2)) {
            java.util.ArrayList arrayList5 = boVar.b;
            java.util.Objects.toString(arrayList5);
            android.util.Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: ".concat(arrayList5.toString()));
        }
        int i2 = 0;
        if (boVar.d.isEmpty()) {
            android.util.Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAd = false;
        } else {
            java.util.ArrayList arrayList6 = boVar.d;
            boVar.g = (u) arrayList6.get(arrayList6.size() - 1);
            java.util.ArrayList arrayList7 = boVar.g.d;
            int size = arrayList7.size();
            for (int i3 = 0; i3 < size; i3++) {
                aw awVar = ((bv) arrayList7.get(i3)).b;
                if (awVar != null) {
                    awVar.t = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAd = boVar.ad(arrayList3, arrayList4, (java.lang.String) null, -1, 0);
        }
        if (!boVar.k.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((java.lang.Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(bo.ag((u) arrayList3.get(i4)));
            }
            java.util.ArrayList arrayList8 = boVar.k;
            int size3 = arrayList8.size();
            while (i2 < size3) {
                ahpw ahpwVar = (ahpw) arrayList8.get(i2);
                java.util.Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        ahpwVar.a((aw) it.next(), zBooleanValue);
                    }
                }
                i2 = i;
            }
        }
        return zAd;
    }
}
