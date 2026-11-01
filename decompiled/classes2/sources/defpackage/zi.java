package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zi {
    public static final defpackage.zi a;
    public static final defpackage.zi b;
    private static final defpackage.zi n;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final defpackage.zl j;
    public final java.util.Set k;
    public final java.util.Set l;
    public final java.util.Set m;

    static {
        defpackage.zh zhVar = new defpackage.zh();
        zhVar.d = 1;
        zhVar.c();
        zhVar.i = false;
        defpackage.zi ziVar = new defpackage.zi(zhVar);
        a = ziVar;
        defpackage.zh zhVar2 = new defpackage.zh();
        zhVar2.d = 2;
        zhVar2.c();
        zhVar2.i = true;
        new defpackage.zi(zhVar2);
        defpackage.zh zhVar3 = new defpackage.zh();
        zhVar3.k = defpackage.zl.a;
        zhVar3.d = 2;
        defpackage.zi ziVar2 = new defpackage.zi(zhVar3);
        n = ziVar2;
        defpackage.zh zhVar4 = new defpackage.zh(ziVar2);
        zhVar4.k = defpackage.zl.c;
        zhVar4.f = 2;
        zhVar4.i = true;
        new defpackage.zi(zhVar4);
        defpackage.zh zhVar5 = new defpackage.zh(ziVar2);
        zhVar5.k = defpackage.zl.c;
        zhVar5.f = 2;
        zhVar5.b();
        zhVar5.i = true;
        new defpackage.zi(zhVar5);
        defpackage.zh zhVar6 = new defpackage.zh(ziVar2);
        zhVar6.f = 1;
        zhVar6.k = defpackage.zl.d;
        zhVar6.i = true;
        zhVar6.d();
        new defpackage.zi(zhVar6);
        defpackage.zh zhVar7 = new defpackage.zh(ziVar2);
        zhVar7.d = 4;
        zhVar7.f = 4;
        zhVar7.b();
        zhVar7.k = defpackage.zl.e;
        zhVar7.i = true;
        zhVar7.d();
        new defpackage.zi(zhVar7);
        defpackage.zh zhVar8 = new defpackage.zh(ziVar2);
        zhVar8.d = 4;
        zhVar8.b();
        zhVar8.i = true;
        zhVar8.d();
        new defpackage.zi(zhVar8);
        defpackage.zh zhVar9 = new defpackage.zh();
        zhVar9.d = 2;
        zhVar9.f = 2;
        zhVar9.b();
        zhVar9.a(1);
        zhVar9.a(androidx.car.app.model.Action.TYPE_MEDIA_PLAYBACK);
        zhVar9.i = true;
        b = new defpackage.zi(zhVar9);
        defpackage.zh zhVar10 = new defpackage.zh();
        zhVar10.d = 1;
        zhVar10.f = 1;
        zhVar10.a(1);
        zhVar10.c();
        zhVar10.i = true;
        new defpackage.zi(zhVar10);
        defpackage.zh zhVar11 = new defpackage.zh();
        zhVar11.d = 2;
        zhVar11.a(1);
        zhVar11.a(androidx.car.app.model.Action.TYPE_COMPOSE_MESSAGE);
        zhVar11.a(androidx.car.app.model.Action.TYPE_MEDIA_PLAYBACK);
        zhVar11.c();
        zhVar11.h = true;
        zhVar11.i = true;
        new defpackage.zi(zhVar11);
        defpackage.zh zhVar12 = new defpackage.zh(ziVar);
        zhVar12.a.add(java.lang.Integer.valueOf(androidx.car.app.model.Action.TYPE_APP_ICON));
        new defpackage.zi(zhVar12);
        defpackage.zh zhVar13 = new defpackage.zh();
        zhVar13.d = 1;
        zhVar13.c();
        zhVar13.f = 0;
        zhVar13.i = true;
        zhVar13.a(1);
        new defpackage.zi(zhVar13);
        defpackage.zh zhVar14 = new defpackage.zh(ziVar);
        zhVar14.a(androidx.car.app.model.Action.TYPE_APP_ICON);
        zhVar14.a(androidx.car.app.model.Action.TYPE_BACK);
        zhVar14.a(1);
        new defpackage.zi(zhVar14);
        defpackage.zh zhVar15 = new defpackage.zh();
        zhVar15.a(1);
        zhVar15.c();
        zhVar15.d = 5;
        zhVar15.f = 0;
        zhVar15.b();
        zhVar15.i = true;
        new defpackage.zi(zhVar15);
        defpackage.zh zhVar16 = new defpackage.zh(ziVar);
        zhVar16.a(androidx.car.app.model.Action.TYPE_APP_ICON);
        zhVar16.a(androidx.car.app.model.Action.TYPE_BACK);
        new defpackage.zi(zhVar16);
        defpackage.zh zhVar17 = new defpackage.zh();
        zhVar17.d = 1;
        zhVar17.i = true;
        zhVar17.c();
        zhVar17.a(1);
        zhVar17.f = 0;
        new defpackage.zi(zhVar17);
        defpackage.zh zhVar18 = new defpackage.zh();
        zhVar18.d = 2;
        zhVar18.f = 2;
        zhVar18.i = true;
        zhVar18.a(1);
        new defpackage.zi(zhVar18);
        defpackage.zh zhVar19 = new defpackage.zh();
        zhVar19.d = 3;
        zhVar19.f = 2;
        zhVar19.i = true;
        zhVar19.a(1);
        new defpackage.zi(zhVar19);
    }

    public zi(defpackage.zh zhVar) {
        int i = zhVar.d;
        this.c = i;
        this.d = zhVar.e;
        this.e = zhVar.f;
        this.j = zhVar.k;
        this.f = zhVar.g;
        this.g = zhVar.h;
        this.h = zhVar.i;
        this.i = zhVar.j;
        java.util.HashSet hashSet = new java.util.HashSet(zhVar.a);
        this.k = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet(zhVar.c);
        this.m = hashSet2;
        java.util.HashSet hashSet3 = new java.util.HashSet(zhVar.b);
        hashSet3.retainAll(hashSet);
        if (!hashSet3.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!zhVar.b.isEmpty() && !hashSet2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.l = new java.util.HashSet(zhVar.b);
        if (hashSet.size() > i) {
            throw new java.lang.IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    public final void a(java.util.List list) {
        java.util.Set set = this.k;
        java.util.Set hashSet = set.isEmpty() ? java.util.Collections.EMPTY_SET : new java.util.HashSet(set);
        int i = this.e;
        int i2 = this.d;
        int i3 = this.c;
        java.util.Iterator it = list.iterator();
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        while (it.hasNext()) {
            androidx.car.app.model.Action action = (androidx.car.app.model.Action) it.next();
            java.util.Set set2 = this.l;
            if (!set2.isEmpty() && set2.contains(java.lang.Integer.valueOf(action.getType()))) {
                throw new java.lang.IllegalArgumentException(androidx.car.app.model.Action.typeToString(action.getType()).concat(" is disallowed"));
            }
            java.util.Set set3 = this.m;
            if (!set3.isEmpty() && !set3.contains(java.lang.Integer.valueOf(action.getType()))) {
                throw new java.lang.IllegalArgumentException(androidx.car.app.model.Action.typeToString(action.getType()).concat(" is not allowed"));
            }
            hashSet.remove(java.lang.Integer.valueOf(action.getType()));
            androidx.car.app.model.CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i4--;
                if (i4 < 0) {
                    throw new java.lang.IllegalArgumentException(a.bs(i, "Action list exceeded max number of ", " actions with custom titles"));
                }
                this.j.a(title);
            }
            i6--;
            if (i6 < 0) {
                throw new java.lang.IllegalArgumentException(a.bs(i3, "Action list exceeded max number of ", " actions"));
            }
            if ((action.getFlags() & 1) != 0 && (i5 = i5 - 1) < 0) {
                throw new java.lang.IllegalArgumentException(a.bs(i2, "Action list exceeded max number of ", " primary actions"));
            }
            if (this.f && action.getIcon() == null && !action.isStandard()) {
                throw new java.lang.IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            if (this.g) {
                if ((action.getBackgroundColor() == null || androidx.car.app.model.CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard()) {
                    throw new java.lang.IllegalArgumentException("Non-standard actions without a background color are disallowed");
                }
            } else if (!androidx.car.app.model.CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.i && (action.getFlags() & 1) == 0) {
                throw new java.lang.IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.h && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new java.lang.IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            sb.append(androidx.car.app.model.Action.typeToString(((java.lang.Integer) it2.next()).intValue()));
            sb.append(',');
        }
        sb.toString();
        throw new java.lang.IllegalArgumentException("Missing required action types: ".concat(sb.toString()));
    }
}
