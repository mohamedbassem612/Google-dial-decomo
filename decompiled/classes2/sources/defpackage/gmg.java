package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gmg {
    final aec a;
    final aec b;
    final aec c;
    public final android.os.Parcel d;
    private final android.util.SparseIntArray e;
    private final int f;
    private final int g;
    private final java.lang.String h;
    private int i;
    private int j;
    private int k;

    public gmg(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new aec(0), new aec(0), new aec(0));
    }

    private final java.lang.Class v(java.lang.Class cls) throws java.lang.ClassNotFoundException {
        aec aecVar = this.c;
        java.lang.Class cls2 = (java.lang.Class) aecVar.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(java.lang.String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        aecVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final int a(int i, int i2) {
        return s(i2) ? this.d.readInt() : i;
    }

    public final android.os.Parcelable b(android.os.Parcelable parcelable, int i) {
        if (!s(i)) {
            return parcelable;
        }
        return this.d.readParcelable(getClass().getClassLoader());
    }

    public final defpackage.gmh c() {
        java.lang.String strN = n();
        if (strN == null) {
            return null;
        }
        defpackage.gmg gmgVarM = m();
        try {
            aec aecVar = this.a;
            java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) aecVar.get(strN);
            if (declaredMethod == null) {
                declaredMethod = java.lang.Class.forName(strN, false, defpackage.gmg.class.getClassLoader()).getDeclaredMethod("read", defpackage.gmg.class);
                aecVar.put(strN, declaredMethod);
            }
            return (defpackage.gmh) declaredMethod.invoke(null, gmgVarM);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException(e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.lang.Throwable cause = e4.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(e4);
        }
    }

    public final java.lang.CharSequence d(java.lang.CharSequence charSequence, int i) {
        if (!s(i)) {
            return charSequence;
        }
        return (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }

    public final java.lang.String e(java.lang.String str, int i) {
        return s(i) ? n() : str;
    }

    public final void f(boolean z, int i) {
        p(i);
        this.d.writeInt(z ? 1 : 0);
    }

    public final void g(java.lang.CharSequence charSequence, int i) {
        p(i);
        android.text.TextUtils.writeToParcel(charSequence, this.d, 0);
    }

    public final void h(int i, int i2) {
        p(i2);
        q(i);
    }

    public final void i(android.os.Parcelable parcelable, int i) {
        p(i);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(java.lang.String str, int i) {
        p(i);
        r(str);
    }

    public final void k(defpackage.gmh gmhVar) {
        if (gmhVar == null) {
            r(null);
            return;
        }
        try {
            r(v(gmhVar.getClass()).getName());
            defpackage.gmg gmgVarM = m();
            try {
                java.lang.Class<?> cls = gmhVar.getClass();
                aec aecVar = this.b;
                java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) aecVar.get(cls.getName());
                if (declaredMethod == null) {
                    declaredMethod = v(cls).getDeclaredMethod("write", cls, defpackage.gmg.class);
                    aecVar.put(cls.getName(), declaredMethod);
                }
                declaredMethod.invoke(null, gmhVar, gmgVarM);
                gmgVarM.o();
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException(e);
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.RuntimeException(e2);
            } catch (java.lang.NoSuchMethodException e3) {
                throw new java.lang.RuntimeException(e3);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                java.lang.Throwable cause = e4.getCause();
                if (cause instanceof java.lang.RuntimeException) {
                    throw ((java.lang.RuntimeException) cause);
                }
                if (!(cause instanceof java.lang.Error)) {
                    throw new java.lang.RuntimeException(e4);
                }
                throw ((java.lang.Error) cause);
            }
        } catch (java.lang.ClassNotFoundException e5) {
            throw new java.lang.RuntimeException(java.lang.String.valueOf(gmhVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
        }
    }

    public final boolean l(boolean z, int i) {
        if (s(i)) {
            return this.d.readInt() != 0;
        }
        return z;
    }

    protected final defpackage.gmg m() {
        android.os.Parcel parcel = this.d;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        java.lang.String str = this.h;
        return new defpackage.gmg(parcel, iDataPosition, i, str.concat("  "), this.a, this.b, this.c);
    }

    public final java.lang.String n() {
        return this.d.readString();
    }

    public final void o() {
        int i = this.i;
        if (i >= 0) {
            android.util.SparseIntArray sparseIntArray = this.e;
            android.os.Parcel parcel = this.d;
            int i2 = sparseIntArray.get(i);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public final void p(int i) {
        o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        q(0);
        q(i);
    }

    public final void q(int i) {
        this.d.writeInt(i);
    }

    public final void r(java.lang.String str) {
        this.d.writeString(str);
    }

    public final boolean s(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.g;
            int i4 = this.k;
            if (i2 >= i3) {
                if (i4 != i) {
                    break;
                }
                return true;
            }
            if (i4 == i) {
                return true;
            }
            if (java.lang.String.valueOf(i4).compareTo(java.lang.String.valueOf(i)) > 0) {
                break;
            }
            android.os.Parcel parcel = this.d;
            parcel.setDataPosition(this.j);
            int i5 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i5;
        }
        return false;
    }

    public final defpackage.gmh t(defpackage.gmh gmhVar) {
        return s(1) ? c() : gmhVar;
    }

    public final void u(defpackage.gmh gmhVar) {
        p(1);
        k(gmhVar);
    }

    private gmg(android.os.Parcel parcel, int i, int i2, java.lang.String str, aec aecVar, aec aecVar2, aec aecVar3) {
        this.a = aecVar;
        this.b = aecVar2;
        this.c = aecVar3;
        this.e = new android.util.SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
