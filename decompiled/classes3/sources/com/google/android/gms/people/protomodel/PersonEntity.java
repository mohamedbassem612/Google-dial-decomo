package com.google.android.gms.people.protomodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PersonEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.people.protomodel.Person {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(7);
    public final java.lang.String a;
    private final java.util.List b;
    private final java.util.List c;
    private final java.util.List d;
    private final java.util.List e;
    private final java.util.List f;
    private final java.util.List g;
    private java.util.List h;
    private java.util.List i;
    private java.util.List j;
    private java.util.List k;
    private java.util.List l;
    private java.util.List m;

    public PersonEntity(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final java.lang.String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final java.util.List b() {
        java.util.List list;
        if (this.m == null && (list = this.g) != null) {
            this.m = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.m.add((com.google.android.gms.people.protomodel.Photo) it.next());
            }
        }
        return this.m;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final java.util.List c() {
        java.util.List list;
        if (this.l == null && (list = this.f) != null) {
            this.l = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.l.add((com.google.android.gms.people.protomodel.Birthday) it.next());
            }
        }
        return this.l;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final java.util.List d() {
        java.util.List list;
        if (this.j == null && (list = this.d) != null) {
            this.j = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.j.add((com.google.android.gms.people.protomodel.Email) it.next());
            }
        }
        return this.j;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final java.util.List e() {
        java.util.List list;
        if (this.h == null && (list = this.b) != null) {
            this.h = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((com.google.android.gms.people.protomodel.Name) it.next());
            }
        }
        return this.h;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.people.protomodel.Person)) {
            return false;
        }
        if (this != obj) {
            com.google.android.gms.people.protomodel.Person person = (com.google.android.gms.people.protomodel.Person) obj;
            if (!j$.util.Objects.equals(a(), person.a()) || !j$.util.Objects.equals(e(), person.e()) || !j$.util.Objects.equals(g(), person.g()) || !j$.util.Objects.equals(d(), person.d()) || !j$.util.Objects.equals(f(), person.f()) || !j$.util.Objects.equals(c(), person.c()) || !j$.util.Objects.equals(b(), person.b())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final java.util.List f() {
        java.util.List list;
        if (this.k == null && (list = this.e) != null) {
            this.k = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.k.add((com.google.android.gms.people.protomodel.Phone) it.next());
            }
        }
        return this.k;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final java.util.List g() {
        java.util.List list;
        if (this.i == null && (list = this.c) != null) {
            this.i = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.i.add((com.google.android.gms.people.protomodel.Photo) it.next());
            }
        }
        return this.i;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{a(), e(), g(), d(), f(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.E(parcel, 4, e());
        aais.E(parcel, 5, g());
        aais.E(parcel, 9, c());
        aais.E(parcel, 11, d());
        aais.E(parcel, 13, f());
        aais.E(parcel, 148, b());
        aais.g(parcel, iF);
    }
}
