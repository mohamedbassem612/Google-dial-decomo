package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class u extends defpackage.bw implements defpackage.bl {
    final defpackage.bo a;
    boolean b;
    public int c;

    public u(defpackage.bo boVar) {
        boVar.h();
        defpackage.bd bdVar = boVar.n;
        if (bdVar != null) {
            bdVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = boVar;
    }

    final void a(int i) {
        if (this.j) {
            if (defpackage.bo.Z(2)) {
                android.util.Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            java.util.ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.bv bvVar = (defpackage.bv) arrayList.get(i2);
                defpackage.aw awVar = bvVar.b;
                if (awVar != null) {
                    awVar.A += i;
                    if (defpackage.bo.Z(2)) {
                        android.util.Log.v("FragmentManager", "Bump nesting of " + bvVar.b + " to " + bvVar.b.A);
                    }
                }
            }
        }
    }

    final void b() {
        java.util.ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.bv bvVar = (defpackage.bv) arrayList.get(size);
            if (bvVar.c) {
                int i = size - 1;
                if (bvVar.a == 8) {
                    bvVar.c = false;
                    arrayList.remove(i);
                    size = i;
                } else {
                    int i2 = bvVar.b.G;
                    bvVar.a = 2;
                    bvVar.c = false;
                    while (i >= 0) {
                        defpackage.bv bvVar2 = (defpackage.bv) arrayList.get(i);
                        if (bvVar2.c && bvVar2.b.G == i2) {
                            arrayList.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.bw
    public final void c() {
        p();
        this.a.J(this, false);
    }

    @Override // defpackage.bw
    public final void d() {
        p();
        this.a.J(this, true);
    }

    @Override // defpackage.bw
    public final void e(int i, defpackage.aw awVar, java.lang.String str, int i2) {
        java.lang.String str2 = awVar.Z;
        if (str2 != null) {
            eku.a(awVar, str2);
        }
        java.lang.Class<?> cls = awVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            java.lang.String str3 = awVar.H;
            if (str3 != null && !str.equals(str3)) {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + awVar + ": was " + awVar.H + " now " + str);
            }
            awVar.H = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + awVar + " with tag " + str + " to container view with no id");
            }
            int i3 = awVar.F;
            if (i3 != 0 && i3 != i) {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + awVar + ": was " + awVar.F + " now " + i);
            }
            awVar.F = i;
            awVar.G = i;
        }
        n(new defpackage.bv(i2, awVar));
        awVar.B = this.a;
    }

    public final void f(java.lang.String str, java.io.PrintWriter printWriter, boolean z) {
        java.lang.String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(java.lang.Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        java.util.ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.bv bvVar = (defpackage.bv) arrayList.get(i);
            switch (bvVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + bvVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(bvVar.b);
            if (z) {
                if (bvVar.d != 0 || bvVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(bvVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(bvVar.e));
                }
                if (bvVar.f != 0 || bvVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(bvVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(bvVar.g));
                }
            }
        }
    }

    @Override // defpackage.bl
    public final boolean g(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (defpackage.bo.Z(2)) {
            toString();
            android.util.Log.v("FragmentManager", "Run: ".concat(toString()));
        }
        arrayList.add(this);
        arrayList2.add(java.lang.Boolean.FALSE);
        if (!this.j) {
            return true;
        }
        this.a.d.add(this);
        return true;
    }

    @Override // defpackage.bw
    public final boolean h() {
        return this.d.isEmpty();
    }

    public final void i(boolean z, boolean z2) {
        if (this.b) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (defpackage.bo.Z(2)) {
            toString();
            android.util.Log.v("FragmentManager", "Commit: ".concat(toString()));
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) new cg());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.j.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.I(this, z);
        }
    }

    @Override // defpackage.bw
    public final void j(defpackage.aw awVar) {
        defpackage.bo boVar = awVar.B;
        if (boVar == null || boVar == this.a) {
            n(new defpackage.bv(4, awVar));
            return;
        }
        throw new java.lang.IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + awVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.bw
    public final void k(defpackage.aw awVar) {
        defpackage.bo boVar = awVar.B;
        if (boVar == null || boVar == this.a) {
            n(new defpackage.bv(3, awVar));
            return;
        }
        throw new java.lang.IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + awVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.bw
    public final void l(defpackage.aw awVar, defpackage.emq emqVar) {
        defpackage.bo boVar = awVar.B;
        defpackage.bo boVar2 = this.a;
        if (boVar != boVar2) {
            java.util.Objects.toString(boVar2);
            throw new java.lang.IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(boVar2.toString()));
        }
        if (emqVar == defpackage.emq.b && awVar.g >= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bg(emqVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
        }
        if (emqVar == defpackage.emq.a) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bg(emqVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
        }
        n(new defpackage.bv(awVar, emqVar));
    }

    @Override // defpackage.bw
    public final void m(defpackage.aw awVar) {
        defpackage.bo boVar = awVar.B;
        if (boVar == null || boVar == this.a) {
            n(new defpackage.bv(5, awVar));
            return;
        }
        throw new java.lang.IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + awVar.toString() + " is already attached to a FragmentManager.");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(' ');
            sb.append(this.l);
        }
        sb.append('}');
        return sb.toString();
    }
}
