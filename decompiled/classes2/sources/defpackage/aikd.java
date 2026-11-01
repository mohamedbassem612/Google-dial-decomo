package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aikd extends defpackage.aifl {
    static final defpackage.aikd b = new defpackage.aikd();
    final transient java.lang.Object[] c;
    public final transient defpackage.aikd d;
    private final transient java.lang.Object e;
    private final transient int f;
    private final transient int g;

    public aikd(java.lang.Object[] objArr, int i) {
        this.c = objArr;
        this.g = i;
        this.f = 0;
        int iD = i >= 2 ? aihd.d(i) : 0;
        this.e = aikj.s(objArr, i, iD, 0);
        this.d = new defpackage.aikd(aikj.s(objArr, i, iD, 1), objArr, i, this);
    }

    @Override // defpackage.aifl
    public final defpackage.aifl b() {
        return this.d;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aihd entrySet() {
        return new aikg(this, this.c, this.f, this.g);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aihd keySet() {
        return new aikh(this, new aiki(this.c, this.f, this.g));
    }

    public final boolean fr() {
        return false;
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object objT = aikj.t(this.e, this.c, this.g, this.f, obj);
        if (objT == null) {
            return null;
        }
        return objT;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.aifl
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }

    private aikd(java.lang.Object obj, java.lang.Object[] objArr, int i, defpackage.aikd aikdVar) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = aikdVar;
    }

    private aikd() {
        this.e = null;
        this.c = new java.lang.Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }
}
